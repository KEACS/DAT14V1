package examples;

import java.util.Random;

public class SleepExample implements Runnable
{
	String name;
	int time;
	Random r = new Random();
	
	public SleepExample(String name)
	{
		this.name = name;
		this.time = r.nextInt(999);
	}

	@Override
	public void run()
	{
		
		try
		{
			System.out.println(name + " is sleeping for " + time + " milliseconds");
			Thread.sleep(time);
			System.out.println(name + " is done!");
		}
		catch (InterruptedException e)
		{

		}
		
	}
}
