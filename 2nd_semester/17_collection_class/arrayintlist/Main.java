package arrayintlist;

public class Main
{

	public static void main(String[] args)
	{
		ArrayIntList al = new ArrayIntList();

		System.out.println(al.size());

		al.add(10);
		al.add(100);
		al.add(110);
		al.add(210);
		
		al.remove(1);

		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		System.out.println(al.size());

	}
}
