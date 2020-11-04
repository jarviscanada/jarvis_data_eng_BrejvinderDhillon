package ca.jrvs.practice.codingChallenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ticket: https://www.notion.so/Duplicate-LinkedList-Node-34430a6275af4286b6df401d5d7b37fc
 */
public class DuplicateLinkedListNode {

  /**
   * Big-O: O(n^2) Justification: we have to iterate through the entire list, O(L) and remove each
   * duplicate O(L).
   */
  public static <E> void removeDuplicates(List<E> list) {
    Set<E> set = new HashSet<>();
    E e = null;

    int i = 0;
    while (i < list.size()) {
      e = list.get(i);
      if (set.add(e)) {
        i++;
      } else {
        list.remove(i);
      }
    }
  }

}
