package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertTrue;

import ca.jrvs.practice.codingChallenge.RemoveNthNodeFromEndList.ListNode;
import org.junit.Before;
import org.junit.Test;

public class RemoveNthNodeFromEndListTest {

  ListNode node1;

  @Before
  public void setUp() throws Exception {
    ListNode node5 = new ListNode(5, null);
    ListNode node4 = new ListNode(4, node5);
    ListNode node3 = new ListNode(3, node4);
    ListNode node2 = new ListNode(2, node3);
    node1 = new ListNode(1, node2);
  }

  @Test
  public void removeNth() {
    boolean removed = true;
    int count = 0;
    ListNode current = null;

    current = RemoveNthNodeFromEndList.removeNth(node1, 2);
    while (current != null) {
      if (current.val == 4) {
        removed = false;
      }
      current = current.next;
      count++;
    }

    assertTrue(count == 4 && removed);

  }
}
