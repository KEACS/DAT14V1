package lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListVsArrayList
{	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		List<String> txt = new LinkedList<String>();
	
		
		Scanner scan = new Scanner(new File("/Users/clbo/Google Drive/KEA_Macbook/Eclipse/SWC2/13_Java_Collections_Framework/src/lecture/mobydick.txt"));

		addToList(scan, txt);
		
		
		System.out.println("ArrayList fyldt!");
		System.out.println(txt.size());
		
		
		while(!txt.isEmpty())
		{
			txt.remove(0);
		}
		System.out.println("ArryaLIst empty! " + txt);

		
	}

	private static void addToList(Scanner scan, List<String> txt)
	{
		while(scan.hasNext())
		{
			txt.add(scan.next());
		}
		
	}
	
	
	
	
}
