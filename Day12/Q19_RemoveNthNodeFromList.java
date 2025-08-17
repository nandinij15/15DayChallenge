
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Q19_RemoveNthNoderomList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 0)
            return head;
        if (head == null || head.next == null)
            return null;
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        int x = c - n;
        if (x == 0)
            return head.next;
        int i = 0;
        temp = head;
        ListNode t2 = head.next;
        while (i < x - 1) {
            temp = temp.next;
            t2 = t2.next;
            i++;
        }
        temp.next = t2.next;
        return head;
    }
}