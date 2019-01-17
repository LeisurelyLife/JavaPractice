package arithmetic;

/**
 * About:
 * Other:
 * Created: ruanting on 2018/12/20 16:30
 * Editored:
 */
public class TwoNumAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        int count = l1.val + l2.val;
        if(count > 10) {
            int val = count - 10;
            listNode.val = val;
            if(l1.next != null) {
                l1.next.val += 1;
            } else {
                l1.next = new ListNode(1);
            }
        } else {
            listNode.val = count;
        }
        if(l1.next != null || l2.next != null) {
            ListNode nextL1 = l1.next == null ? new ListNode(0) : l1.next;
            ListNode nextL2 = l2.next == null ? new ListNode(0) : l2.next;
            listNode.next = addTwoNumbers(nextL1, nextL2);
        }
        return listNode;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public ListNode() {
        }
    }
}
