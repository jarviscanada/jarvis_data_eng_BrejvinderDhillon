package ca.jrvs.practice.codingChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Ticket: https://www.notion.so/Missing-Number-4146612335d84b2e9704d1bfe251a705
 */
public class MissingNumber {

  /**
   * Big-O: O(n), Justification: have to loop 2n which reduces to n. Will run into overflow issues
   * with large numbers.
   */
  public static int sumAll(int[] nums) {
    int expectedSum = 0;
    int actualSum = 0;

    for (int i = 1; i < nums.length + 1; i++) {
      expectedSum += i;
    }

    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }

  /**
   * Big-O: O(n) Justification: We have to add all the numbers to the set which is O(n)
   */
  public static int set(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    int expectedNumCount = nums.length + 1;

    for (int num = 0; num < expectedNumCount; num++) {
      if (!set.contains(num)) {
        return num;
      }
    }

    return -1;
  }

  /**
   * Big-O: O(n) time Justification: We have to loop through the numbers to get the actual sum and
   * compare it with the Gaussian sum which is computed in constant time. Summation is susceptible
   * to overflow.
   */
  public static int sumAllGauss(int[] nums) {
    int expectedSum = 0;
    int actualSum = 0;
    int n = nums.length;

    expectedSum = n * (n + 1) / 2;

    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }
}
