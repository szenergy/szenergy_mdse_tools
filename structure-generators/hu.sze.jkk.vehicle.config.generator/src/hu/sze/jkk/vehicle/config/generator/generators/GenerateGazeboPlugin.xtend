package hu.sze.jkk.vehicle.config.generator.generators

import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle

class GenerateGazeboPlugin {
	/// Kinematic conversions
	def static double degToRadians(double ang)
	{
		return ang*Math.PI/180.0;
	}
	
	
	def static pluginControlStateName(Vehicle vehicle)'''SzenergyGazeboControlState'''
	def static pluginPluginStateName(Vehicle vehicle)'''SzenergyGazeboPluginState'''
	def static pluginPluginControlLogic(Vehicle vehicle)'''SzenergyGazeboControlLogic'''
	def static pluginSimulationName(Vehicle vehicle)'''«vehicle.name.toFirstUpper»SimulationPlugin'''
	
	def static generateGazeboPlugin(Vehicle vehicle)'''
	/**
	  * This plugin is generated from kino-dynamic description 
	  */
	#include <szelectricity_gazebo_plugins/gazebo_wheel_plugin.hpp>
	#include <szelectricity_gazebo_plugins/gazebo_szenergy_common.hpp>
	
	#include <autoware_msgs/VehicleStatus.h>
	
	using namespace szenergy::vehicle_dynamics_parameter;
	using namespace szenergy;
	
	namespace gazebo
	{	
	    class «pluginSimulationName(vehicle)»: public «pluginPluginControlLogic(vehicle)», public ModelPlugin
	    {
	    protected:
	      const std::string NODE_NAME;
	      // ROS related stuff
	      std::shared_ptr<ros::NodeHandle> nh;
	      ros::Subscriber sub_angle;
	      ros::Subscriber sub_velocity;
	      ros::Subscriber sub_twist_cmd;
	      // Publish state
	      ros::Publisher  pub_current_velocity;
	      ros::Publisher  pub_vehicle_status;   ///< Autoware vehicle status
	      ros::Timer      state_timer;
	      // Connection handler
	      event::ConnectionPtr updateConnection;
	    public:
	        «pluginSimulationName(vehicle)»()
	        {
	        	param = std::unique_ptr<szenergy::VehicleParameters>(new 
	                szenergy::VehicleParameters(
	                    "«vehicle.name»",
	                    «vehicle.kinematicparameters.wheelparameters.wheel_radius»,
	                    «vehicle.kinematicparameters.wheelbase»,
	                    «vehicle.kinematicparameters.front_track»,
	                    «vehicle.kinematicparameters.rear_track»,
	                    «vehicle.dynamicparameters.inertialparameters.cog_ratio»
	                )
	            );
	            dyn_param = std::unique_ptr<szenergy::VehicleDynamicParameters>(
	                new szenergy::VehicleDynamicParameters(
	                    «vehicle.dynamicparameters.aerodynamicparameters.air_resistance»,
	                    0.09228,
	                    2.76
	                )
	            );
	            kin_limits = std::unique_ptr<szenergy::VehicleKinematicLimits>(
	                new szenergy::VehicleKinematicLimits(
	                    «degToRadians(vehicle.kinematicparameters.steeringparameters.inner_angle)»,
	                    6.12
	                )
	            );
	        }
	        virtual ~«pluginSimulationName(vehicle)»()
	        {
	            updateConnection.reset();
	            pluginstate.reset();
	        }
	        
	        void callbackUpdateState(const ros::TimerEvent&)
	        {
	        	updateFirstOrderState();
	        	auto t = ros::Time::now();
	            pluginstate->vehicle_firstorder_state.header.stamp = t;					///< REQ1.1 All messages published from Gazebo vehicle plugin shall be timestamped 
	            pluginstate->vehicle_status.header.stamp = t;							///< REQ1.1
	        	pub_current_velocity.publish(pluginstate->vehicle_firstorder_state);    ///< REQ2.1 Gazebo vehicle plugins shall publish current velcoity as standard geometry message
	        	pub_vehicle_status.publish(pluginstate->vehicle_status); 				///< REQ9.1 Gazebo vehicle plugins should publish Autoware vehicle stati 
	        }
	
	        void initRosNode()
	        {
	            int argc = 0;
	            char **argv = NULL;
	            ros::init(argc, argv, NODE_NAME + pluginstate->model->GetName(),
	                ros::init_options::NoSigintHandler);
	            nh = std::shared_ptr<ros::NodeHandle>(new ros::NodeHandle());
	            sub_angle = nh->subscribe("/«vehicle.name»/steerangle", 10, &«pluginSimulationName(vehicle)»::onSteerAngle, this);
	            sub_velocity = nh->subscribe("/«vehicle.name»/refvelocity", 10, &«pluginSimulationName(vehicle)»::onVelocity, this);
	            sub_twist_cmd = nh->subscribe("/twist_cmd", 10, &«pluginSimulationName(vehicle)»::onTwistCmd, this);
	            /// State publisher
	            pub_current_velocity = nh->advertise<geometry_msgs::TwistStamped>("/current_velocity", 10);						///< Initialize publisher (current_velocity)
	            pub_vehicle_status = nh->advertise<autoware_msgs::VehicleStatus>("/vehicle_status", 10);						///< Initialize publisher (vehicle_status)
	            state_timer = nh->createTimer(ros::Duration(1.0/40.0), &NissanleafSimulationPlugin::callbackUpdateState, this);
	            ROS_INFO("Starting ROS node");
	        }
	        
	        
	
	        /**
	         * 
	         * */
	        void onTwistCmd(const geometry_msgs::TwistStamped::ConstPtr& msg)
	        {
	            updateTwistCommand(msg);
	        }
	
	        void onSteerAngle(const std_msgs::Float64::ConstPtr &msg)
	        {
	            updateSteerAngleCommand(msg);
	        }
	
	        void onVelocity(const std_msgs::Float64::ConstPtr &msg)
	        {
	            updateVelocityCommand(msg);
	        }
	
	        void setup(physics::ModelPtr _model, sdf::ElementPtr _sdf)
	        {
	        	setupPlugin(_model, _sdf);
	        }
	
	        void Load(physics::ModelPtr _model, sdf::ElementPtr _sdf)
	        {
	            setup(_model, _sdf);
	            updateConnection = event::Events::ConnectWorldUpdateBegin(std::bind(&«pluginSimulationName(vehicle)»::Update, this));
	            initRosNode();
	        }
	
	        void Update()
	        {
	            updateVehicle();
	        }
	
	    };
	    GZ_REGISTER_MODEL_PLUGIN(«pluginSimulationName(vehicle)»)
	}
	
	'''
}