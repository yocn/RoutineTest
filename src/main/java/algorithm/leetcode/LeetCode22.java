package algorithm.leetcode;

import algorithm.ITestInterface;
import util.LogUtil;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例 1：
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * <p>
 * 示例 2：
 * 输入：head = []
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：head = [1]
 * 输出：[1]
 * <p>
 * 提示：
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode22 implements ITestInterface {
    @Override
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode result = swapPairs(node1);
        StringBuilder sb = new StringBuilder();
        ListNode node = result;
        while (node != null) {
            sb.append(node.val).append(" ");
            node = node.next;
        }
        LogUtil.d("sb::" + sb.toString());
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode preFake = new ListNode(0, head);
        ListNode pre = preFake;
        while (pre != null) {
            pre = swapInternal(pre);
        }
        return preFake.next;
    }

    private ListNode swapInternal(ListNode pre) {
        ListNode head = pre.next;
        if (head == null) {
            return null;
        }
        ListNode next = head.next;
        if (next == null) {
            return null;
        }
        ListNode nextNext = next.next;
        pre.next = next;
        head.next = nextNext;
        next.next = head;
        return head;
    }


    public static class ListNode {
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

}
