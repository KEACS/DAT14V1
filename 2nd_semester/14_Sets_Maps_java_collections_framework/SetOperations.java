package SetExample;

import java.util.HashSet;
import java.util.Set;

public class SetOperations
{
	public static void main(String[] args)
	{
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("Berit");
		set1.add("Jens");
		set1.add("Hannah");
		set1.add("Bent");
	
		
		set2.add("Søren");
		set2.add("Troels");
		set2.add("Berit");
		set2.add("Bent");
		
		//set1.addAll(set2);
		set1.retainAll(set2);
		//set1.removeAll(set2);
		//System.out.println(set1.containsAll(set2));
		System.out.println(set1);
	}
}
