package Day5;

import java.util.Stack;
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Q2_LinkedlistCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            if(!st.contains(temp)){
                st.push(temp);
            }else{
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
