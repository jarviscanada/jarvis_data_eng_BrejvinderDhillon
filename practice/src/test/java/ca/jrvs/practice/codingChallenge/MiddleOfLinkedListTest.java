package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import ca.jrvs.practice.codingChallenge.MiddleOfLinkedList.ListNode;
import org.junit.Before;
import org.junit.Test;

public class MiddleOfLinkedListTest {

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
  public void middleNode() {
    int count = 0;
    ListNode current = null;

    current = MiddleOfLinkedList.middleNode(node1);
    assertSame(current, node1.next.next);

    while (current != null) {
      current = current.next;
      count++;
    }

    assertEquals(3, count);
  }
}
