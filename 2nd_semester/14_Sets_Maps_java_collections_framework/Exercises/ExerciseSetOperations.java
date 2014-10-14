import java.util.ArrayList;
import java.util.List;

public class ExerciseSetOperations
{
	public static void main(String[] args)
	{
		// the following exercise should first be done using the ArrayLists
		// complete the code so you can print out the result
		// then after that change the Lists into Sets and use the addAll(); retainAll(); removeAll();
		// for the same operations on sets
		
		List<Integer> set1 = new ArrayList<Integer>();
		List<Integer> set2 = new ArrayList<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(4);
		set2.add(3);
		set2.add(6);
		set2.add(7);

		System.out.println(uniqueFromBoth(set1, set2));
		System.out.println(allThatAreInBoth(set1, set2)));
	}
	private static List<Integer> uniqueFromBoth(List<Integer> set1, List<Integer> set2)
	{		
		// write code that returns all unique elements from set1 and set2 when combined
		return null;
	}
	private static List<Integer> allThatAreInBoth(List<Integer> set1, List<Integer> set2)
	{
		// write code that returns all elements that are both in set1 and set2
		return null;
	}
	
}
