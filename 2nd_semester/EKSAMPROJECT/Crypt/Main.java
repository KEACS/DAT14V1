public class Main
{
	public static void main(String[] args) throws Exception
	{		
		String userName = "clbo";
		String password = "1234";
		byte[] cryptPassword = CryptApp.cryptString(password);
		System.out.println("Username:" + userName);
		System.out.println("Det Ukrypterede password:" + password);
		System.out.println("Det krypterede password:" + cryptPassword);
	}

}
