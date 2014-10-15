package writestars;

public class WriteStars
{
	public static void main(String[] args)
	{
		// writeStars(4);
		writeStarsRecursive(7);
	}

	public static void writeStars(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	public static void writeStarsRecursive(int n)
	{
		if (n == 0) // base case
		{
			System.out.println();
		}
		else // recursion case
		{
			System.out.print("*");
			writeStarsRecursive(n - 1);
		}
	}

}
