package SetExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListVsArrayList
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Set<String> txt = new TreeSet<String>();

		Scanner scan = new Scanner(new File("/Users/clbo/Google Drive/KEA_Macbook/Eclipse/SWC2/13_Java_Collections_Framework/src/lecture/words.txt"));

		System.out.println("Loop started!");
		while (scan.hasNext())
		{
			String word = scan.next();
			txt.add(word);
			
			
			
//			if(!txt.contains(word))
//			{
				
//			}
				

		}
		System.out.println("ArrayList is full!");
		System.out.println("List size: " + txt.size());
		System.out.println(txt);
	}
}
