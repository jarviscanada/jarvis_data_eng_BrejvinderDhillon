package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Nth-Node-From-End-of-LinkedList-e871bc3964b344269188f5aac3f0de33
 */
public class RemoveNthNodeFromEndList {

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  /**
   * Big-O: O(L). Justification: we make 2 passes through the list but the first is through the
   * first (n + 1) nodes; the second is through the remaining (L - (n + 1)) nodes; therefore overall
   * we make one pass through the whole list; we assume n is always valid (<= L).
   */
  public static ListNode removeNth(ListNode head, int n) {
    ListNode dummy = new ListNode(0, head);
    ListNode first = dummy;
    ListNode second = dummy;

    for (int i = 0; i < n + 1; i++) {
      first = first.next;
    }

    while (first != null) {
      first = first.next;
      second = second.next;
    }

    second.next = second.next.next;

    return dummy.next;
  }

}
