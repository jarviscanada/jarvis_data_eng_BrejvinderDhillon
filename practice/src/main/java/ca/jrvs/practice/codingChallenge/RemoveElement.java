package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Remove-Element-ccb270db66f045d19149d4a944eb1ecd
 */
public class RemoveElement {

  /**
   * Big-O: O(n) Justification: We iterate over the input array once and in each iteration do O(1)
   * ops in place.
   */
  public static int removeElement(int[] nums, int value) {
    int slow = 0;
    int fast = 0;

    while (fast < nums.length) {
      if (nums[fast] == value) {
        fast++;
      } else {
        nums[slow++] = nums[fast++];
      }
    }

    return slow;
  }

}
