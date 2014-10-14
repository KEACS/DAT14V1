import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseNumbers
{
	// Array of Integers
	private static Integer[] integers = { 1, 21, 2, 4, 32, 3, 2, 4, 5, 4, 2, 65, 343, 43, 33, 23, 1, 32, 3, 2, 34, 2, 34, 25, 45, 345, 345, 345, 43, 3, 23, 25, 2, 5, 25, 43, 54, 35, 345, 3, 24, 6,
			34523, 6, 54, 5, 43, 45, 3, 4345, 345, 354, 43, 23, 45, 3, 45, 245, 53, 345, 435, 43, 34, 53, 543, 543, 1, 21, 2, 4, 32, 3, 2, 4, 5, 4, 2, 65, 343, 43, 33, 23, 1, 32, 3, 2, 34, 2, 34, 25,
			45, 345, 345, 345, 43, 3, 23, 25, 2, 5, 25, 43, 54, 35, 345, 3, 24, 6, 34523, 6, 54, 5, 43, 45, 3, 4345, 345, 354, 43, 23, 45, 3, 45, 245, 53, 345, 435, 43, 34, 53, 543, 543, 1, 21, 2, 4,
			32, 3, 2, 4, 5, 4, 2, 65, 343, 43, 33, 23, 1, 32, 3, 2, 34, 2, 34, 25, 45, 345, 345, 345, 43, 3, 23, 25, 2, 5, 25, 43, 54, 35, 345, 3, 24, 6, 34523, 6, 54, 5, 43, 45, 3, 4345, 345, 354,
			43, 23, 45, 3, 45, 245, 53, 345, 435, 43, 34, 53, 543, 543, 1, 21, 2, 4, 32, 3, 2, 4, 5, 4, 2, 65, 343, 43, 33, 23, 1, 32, 3, 2, 34, 2, 34, 25, 45, 345, 345, 345, 43, 3, 23, 25, 2, 5, 25,
			43, 54, 35, 345, 3, 24, 6, 34523, 6, 54, 5, 43, 45, 3, 4345, 345, 354, 43, 23, 45, 3, 45, 245, 53, 345, 435, 43, 34, 53, 543, 543 };

	public static void main(String[] args)
	{
		// In the large Array 'integers' i want to know:
		// 1. How many unique numbers are in the array?
		// 2. How many number in total?

		// Finish the program
		
	}

	/**
	 * Converts the Array to an ArrayList
	 * @author clbo
	 * @return {@link List}
	 */
	private static List<Integer> convertArrayToList()
	{
		List<Integer> i = new ArrayList<Integer>();
		i = Arrays.asList(integers);
		return i;

	}

}
