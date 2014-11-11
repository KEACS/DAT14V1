package chrk.racecar.clbo;

public class ExerciseRace
{
	public static void main(String [] args)
	{
		ExerciseRaceCar[] cars = new ExerciseRaceCar[5];
		int laps = 5;
	
		for(int i = 0; i < cars.length; i++)
		{
			cars[i] = new ExerciseRaceCar(laps, "Car" + (i+1));
		}
	
		for(int i = 0; i < cars.length; i++)
		{
			cars[i].run();
		}
	}
}
