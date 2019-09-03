package hu.sze.jkk.vehicle.config.generator.generators.code

import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle

class GenerateOdometryInstantiation {
	static def templateOdometryProgram(Vehicle ve)'''
	#include <szelectricity_odometry/vehicle_odometry.hpp>
	
	#include <boost/program_options.hpp>
	
	#include <szenergy_config/szenergy_config.hpp>
	
	#include <szelectricity_odometry/vehicleodometry_factory.hpp>
	
	using namespace szenergy;
	namespace po = boost::program_options;
	
	int main(int argc, char* argv[]){
	    ros::init(argc, argv, "«ve.name»_odometry");
	    // Parse arguments
	    po::options_description desc("Allowed options");
	    desc.add_options()
	        ("help", "Show help")
	        ("simulation", po::value<bool>(), "initialize pose from Gazebo simulation")
	    ;
	    po::variables_map vm;
	    po::store(po::parse_command_line(argc, argv, desc), vm);
	    po::notify(vm);
	    if (vm.count("help")){
	        std::cout << desc << std::endl;
	        return 1;
	    }
	    bool use_simulation = true;
	    if (vm.count("simulation"))
	    {
	        use_simulation = vm["simulation"].as<bool>();
	    }
	    
	    Configurer conf;
	    VehicleOdometryNode odom = szenergy::createBicycleOdometry(conf, 
	        "«ve.name»", use_simulation);
	    
	    return 0;
	}
	'''
}