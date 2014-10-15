package delete.files;

import java.io.File;

public class ListAllFiles
{

	public static void main(String[] args)
	{
		String folder = "/Users/clbo/Google Drive/KEA_Macbook/Eclipse/SWC2/14_recursion/src/delete/files/tmp";
		
		ListOfAllFiles(new File(folder));

	}

	private static void ListOfAllFiles(File file)
	{
		for (File f : file.listFiles())
		{
			System.out.println(f);
		}
		
		
	}

}
