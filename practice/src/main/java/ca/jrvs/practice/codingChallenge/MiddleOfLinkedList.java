package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Middle-of-the-Linked-List-95f6cdc2d4014a2585608eb0bcd80b27
 */
public class MiddleOfLinkedList {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  /**
   * Big-O: O(n) Justification: We traverse 1/2 nodes with fast and 1/2 nodes with slow so overall
   * we traverse n nodes.
   */
  public static ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }

}
