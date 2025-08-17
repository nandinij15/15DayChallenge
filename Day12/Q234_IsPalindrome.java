
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Q234_IsPalindrome{
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow);
        temp=head;
        while(slow!=null)
        {
            if(temp.val!=slow.val)
            return false;
            temp=temp.next;
            slow=slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        return head;
        ListNode temp=null;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
