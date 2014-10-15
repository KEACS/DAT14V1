package delete.files;

import java.io.File;

public class DeleteNonRecursive
{

	public static void main(String[] args)
	{
		String folder = "/Users/clbo/Google Drive/KEA_Macbook/Eclipse/SWC2/14_recursion/src/delete/files/tmp";
		File file = new File(folder);

		file.delete();
		System.out.println("Folder deleted if it was empty of files");

	}

}
