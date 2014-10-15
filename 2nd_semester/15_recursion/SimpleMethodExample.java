package simple.method.example;

public class SimpleMethodExample
{

	public static void main(String[] args) throws InterruptedException
	{
		method1();

	}

	private static void method1() throws InterruptedException
	{
		System.out.println("Entered Method 1");
		Thread.sleep(2000);
			// Go to method2 and run code in that
			method2();
				// System.out.println("Entered Method 2");
				// Thread.sleep(2000);
				// System.out.println("Hello from method 2");
				// Thread.sleep(2000);
				// System.out.println("exit method 2");
			
		// finish the code in this method
		System.out.println("Re-Entered Method 1");
		Thread.sleep(2000);
		System.out.println("Hey from method 1");
		Thread.sleep(2000);
		System.out.println("Exit method 1");

	}

	private static void method2() throws InterruptedException
	{
		System.out.println("Entered Method 2");
		Thread.sleep(2000);
		System.out.println("Hello from method 2");
		Thread.sleep(2000);
		System.out.println("exit method 2");
		Thread.sleep(2000);
		// go back to method1 and finish finish the last code in that method

	}



}
