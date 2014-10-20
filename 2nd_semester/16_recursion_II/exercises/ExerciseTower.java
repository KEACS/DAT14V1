package exercises.nestedforloop;

public class ExerciseTower
{
	/*
	 * Remember 1st semester and the nested for loops :)
	 * Underneath is one of them.
	 * Write a recursive method called recursive() which takes an int as an argument
	 * The int describes how many lines of stars are in the figure.
	 * 	
	 	*******
	 	******
	 	*****
	 	****
	 	***
	 	**
	 	*
	 * When done make the method print out the figure upside down (first line 1 *).
	 */
	public static void main(String[] args)
	{
		nestedForLoop(7);

	}

	private static void nestedForLoop(int lines)
	{
		for (int line = 0; line <= lines; line++)
		{
			// stars
			for (int star = 1; star <= line; star++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
