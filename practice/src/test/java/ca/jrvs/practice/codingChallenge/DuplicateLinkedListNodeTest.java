package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

public class DuplicateLinkedListNodeTest {

  List<Integer> list = new LinkedList<>(Arrays.asList(4, 2, 0, 4, 2, 0));
  List<Integer> list2 = new LinkedList<>(Arrays.asList(4, 2, 0));

  @Test
  public void removeDuplicates() {
    DuplicateLinkedListNode.removeDuplicates(list);
    assertEquals(list, list2);
  }
}