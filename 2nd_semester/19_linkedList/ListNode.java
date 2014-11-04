package examples;

public class ListNode
{
	   public int data;
	   public ListNode next;
	   
	   public ListNode()
	   {
	      this(0, null);
	   }
	   public ListNode(int data)
	   {
	      this(data, null);
	   }
	   public ListNode(int data, ListNode next)
	   {
	      this.data = data;
	      this.next = next;
	   }

}
