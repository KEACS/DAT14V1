public class ExerciseMixinNodes
{
   
   public static void main(String[] args)
   {
      ListNode dummy = new ListNode(1);
      
      ListNode list = new ListNode(1, new ListNode(3));
      ListNode temp = new ListNode(2, new ListNode(4));
      
      // Here you have 2 lists of nodes
      // one with the numbers 1 and 3
      // one with the numbers 2 and 4
      // Make a chain of nodes (mix the to lists)
      // so the numbers will appear int the right order 
   }
}