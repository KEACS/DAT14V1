package delete.files;

import java.io.File;

/**
 * This utility class can be used to delete folders recursively in java This
 * -in-java-recursion
 * 
 * Code was taken from:
 * http://www.journaldev.com/833/how-to-delete-a-directoryfolder
 * 
 * @author pankaj
 */
public class DeleteFolderRecursively
{

	public static void main(String[] args)
	{
		String folder = "/Users/clbo/Google Drive/KEA_Macbook/Eclipse/SWC2/14_recursion/src/delete/files/tmp";
		// delete folder recursively
		recursiveDelete(new File(folder));
	}

	public static void recursiveDelete(File file)
	{
		// to end the recursive loop
		if (!file.exists())
			return;

		// if directory, go inside and call recursively
		if (file.isDirectory())
		{
			for (File f : file.listFiles())
			{
				// call recursively
				recursiveDelete(f);
			}
		}
		// call delete to delete files and empty directory
		file.delete();
		System.out.println("Deleted file/folder: " + file.getAbsolutePath());
	}

}
