package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/LinkedList-Cycle-77fd5cdbcf8a4118a15a60920d5f865f
 */
public class LinkedListCycle {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  /**
   * Big-O: O(n) Justification: If there is a cycle both pointers meet each other after O(n)
   * iterations. The slow pointer moves 1 node at a time, the fast moves 2 nodes at a time, if
   * there's a cycle then the fast pointer will circle back around and eventually meet the slow
   * pointer.
   */
  public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    ListNode slow = head;
    ListNode fast = head.next;

    while (slow != fast) {
      if (fast == null || fast.next == null) {
        return false;
      }

      slow = slow.next;
      fast = fast.next.next;
    }

    return true;
  }

}
