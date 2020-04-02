package hu.sze.aut.diffrobot.transformation

class GenerateError extends Exception {
	
}

class GenerateSensorError extends Exception {
	new(String message)
	{
		super(message);
	}
}