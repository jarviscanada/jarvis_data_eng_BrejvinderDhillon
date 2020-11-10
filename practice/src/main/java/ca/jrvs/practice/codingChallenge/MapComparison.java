package ca.jrvs.practice.codingChallenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Ticket: https://www.notion.so/How-to-compare-two-maps-745e7ae3bd3a4f9fbaec89092b224661
 */
public class MapComparison {

  /**
   * Big-O: O(n) time, O(n) space. Justification: We have to compare all the elements in both maps.
   */
  public <K, V> boolean mapEquals(HashMap<K, V> m1, HashMap<K, V> m2) {
    return m1.equals(m2);
  }

  /**
   * Big-O: O(n) time, O(n) space.
   * Justification: We have to compare all the elements in both maps.
   */
  public <K, V> boolean nodeEquals(Map<K, V> m1, Map<K, V> m2) {
    Set<Entry<K, V>> entries1 = m1.entrySet();
    Set<Map.Entry<K, V>> entries2 = m2.entrySet();

    Iterator<Entry<K, V>> iterator1 = entries1.iterator();
    Iterator<Entry<K, V>> iterator2 = entries2.iterator();

    while (iterator1.hasNext()) {
      if (!iterator1.next().equals(iterator2.next())) {
        return false;
      }
    }

    return true;
  }
}
