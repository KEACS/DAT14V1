package examples;

public class MainSleepExample
{

	public static void main(String[] args)
	{
		Thread t1 = new Thread(new SleepExample("one"));
		Thread t2 = new Thread(new SleepExample("two"));
		Thread t3 = new Thread(new SleepExample("three"));
		Thread t4 = new Thread(new SleepExample("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
