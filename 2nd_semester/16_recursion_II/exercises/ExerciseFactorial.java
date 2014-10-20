package exercises.factorial;

public class ExerciseFactorial
{
	/*
	 In 1st semester we made a method that could calculate the factorial of a number
	 4! = 24, 5! = 120 etc. Underneath you can see an example of that.
	 Your job is to make a method that uses recursion to get to the same result.
	 Hint: 4! = 4*3*2*1 = 24 or 4! = 4 * 3! 
	 
	 When this is done you should make the program able to print out 
	 5! = 120
	 4! = 24
	 3! = 6
	 2! = 2
	 1! = 1
	 0! = 1
	 
	 */
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
		
	}

	private static int factorial(int number)
	{
		int factorial = 1;
		for (int i = number; i >= 1; i--)
		{
			factorial = factorial * i;
		}

		return factorial;
	}

}
