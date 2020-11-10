package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Ticket: https://www.notion.so/Two-Sum-83b94b1db00c45c993419d58be4ac09a
 */
public class TwoSum {

  /**
   * Big-O: O(n^2) Justification: For each element, we loop through the array to find if there is
   * another value that adds up to the target. For each element n, we loop n times so O(n^2)
   */
  public static int[] bruteForce(int[] nums, int target) {
    int x, y = 0;

    for (int i = 0; i < (nums.length - 1); i++) {
      x = nums[i];
      for (int j = 1; j < nums.length; j++) {
        y = nums[j];
        if (x + y == target && i != j) {
          return new int[]{i, j};
        }
      }
    }
    return new int[0];
  }

  /**
   * Big-O: O(nlog(n)) Justification: We do at most n iterations when looking for the two indices.
   * However, when sorting the list, the best tme would be O(nlog(n)). nlog(n) + n = O(nlog(n)).
   */
  public static int[] sorting(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    Arrays.sort(nums);

    while (left < right) {
      if ((nums[left] + nums[right]) == target) {
        return new int[]{left, right};
      } else if ((nums[left] + nums[right]) < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[0];
  }

  /**
   * Big-O: O(n) Justification: While we iterate and insert elements into the map, we also look back
   * to check if current element's complement already exists in the table. If it exists, we have
   * found a solution and return immediately. Iterating through the entirety of the input takes O(n)
   * and lockups only take O(1) time.
   */
  public static int[] map(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[]{map.get(complement), i};
      }

      map.put(nums[i], i);
    }
    return new int[0];
  }

}
