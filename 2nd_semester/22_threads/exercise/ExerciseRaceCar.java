package chrk.racecar.clbo;

public class ExerciseRaceCar
{
	private int labs;
	private String name;
	
	public ExerciseRaceCar(int labs, String name)
	{
		this.labs = labs;
		this.name = name;
	}
	
	public void run()
	{
		for(int i = 1; i <= labs; i++)
		{	
			System.out.println(name + " lab " + i);
		}
		System.out.println(name + " finished!");
	}
}
