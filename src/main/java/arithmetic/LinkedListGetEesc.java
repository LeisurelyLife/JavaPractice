package arithmetic;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/14 10:10
 * Editored:
 * Description: 输入一个链表，输出该链表中倒数第k个结点
 */
public class LinkedListGetEesc {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode listNode = linkedListGetEesc(n1, 4);
        System.out.println(listNode.val);
    }

    public static ListNode linkedListGetEesc(ListNode node, int k) {
        ListNode p = node;
        ListNode p2 = node;
        int count = 0;
        int a = k;
        while (p != null) {
            p = p.next;
            count++;
            if (k < 1) {
                p2 = p2.next;
            }
            k--;
        }
        if (k > count) {
            return null;
        }
        return p2;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
