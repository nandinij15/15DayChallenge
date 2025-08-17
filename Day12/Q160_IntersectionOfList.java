
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Q160_IntersectionOfList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        ListNode x=headA;
        ListNode y=headB;

        while(x!=y)
        {
            x=(x==null)?headB:x.next;
            y=(y==null)?headA:y.next;

        }
        return x;
    }
}