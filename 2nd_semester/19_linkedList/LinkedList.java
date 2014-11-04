package examples;

public class LinkedList
{
	private ListNode front;

	public String toString()
	{
		if (front == null)
		{
			return "[]";
		}
		else
		{
			String result = "[" + front.data;
			ListNode current = front.next;
		     while(current.next != null)
		     {
		        result += ", " + current.data;
		       current = current.next;
		     }
			result += ", " + current.data + "]";
			return result;
		}
	}
	
	
	
//	 
}
