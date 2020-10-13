package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Ticket: https://www.notion.so/Find-the-Duplicate-Number-691decee066c4949b2463aae3cd98e12
 */
public class DuplicateNumber {

  /**
   * Big-O: O(nlogn). Justification: Arrays.sort uses dual-pivot quick sort which is O(nlogn).
   */
  public static int sorting(int[] a) {
    Arrays.sort(a);

    for (int i = 0; i < (a.length - 1); i++) {
      if (a[i] == a[i + 1]) {
        return a[i];
      }
    }

    return -1;
  }

  /**
   * Big-O: O(n) Justification: We have to iterate over all elements, n, and set operations are
   * O(1).
   */
  public static int set(int[] a) {
    Set<Integer> set = new HashSet<>();

    for (int i : a) {
      if (!set.add(i)) {
        return i;
      }
    }

    return -1;
  }

}
