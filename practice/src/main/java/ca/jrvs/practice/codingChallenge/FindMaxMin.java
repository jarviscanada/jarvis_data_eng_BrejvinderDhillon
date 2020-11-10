package ca.jrvs.practice.codingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Ticket: https://www.notion.so/Find-Largest-Smallest-cf066b5adb9348b69f850c8fffbe187c
 */
public class FindMaxMin {

  /**
   * Big-O: O(n) time Justification: We have to loop through all elements in the array to find
   * either the max or min. Both loops could be combined into one to find the max and min at the
   * same time.
   */
  public static int loopMax(int[] a) {
    int max = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }

  public static int loopMin(int[] a) {
    int min = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    return min;
  }

  /**
   * Big-O: O(n). Justification: We have to loop through all elements in array to find either max or
   * min.
   */
  public static int streamMax(int[] a) {
    return Arrays.stream(a).max().getAsInt();
  }

  public static int streamMin(int[] a) {
    return Arrays.stream(a).min().getAsInt();
  }

  /**
   * Big-O: O(n) Justification: We have to loop through all elements in array to find either max or
   * min.
   */
  public static int collectionsMax(int[] a) {
    List<Integer> l = new ArrayList<>();

    Arrays.stream(a).forEach(e -> l.add(e));

    return Collections.max(l);
  }

  public static int collectionsMin(int[] a) {
    List<Integer> l = new ArrayList<>();

    Arrays.stream(a).forEach(e -> l.add(e));

    return Collections.min(l);
  }

}
