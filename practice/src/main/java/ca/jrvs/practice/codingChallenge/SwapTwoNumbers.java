package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Swap-two-numbers-db7859207bed4a9987bca7d45fa82064
 */
public class SwapTwoNumbers {

  /**
   * Big-O: O(1) Justification: We perform 3 O(1) operations which reduces to O(1) Using '+' and '-'
   * or '*' and '/' or '^' (XOR) can all cause overflow.
   */
  public static void swapBit(int[] a) {
    a[0] = a[0] ^ a[1];
    a[1] = a[0] ^ a[1];
    a[0] = a[0] ^ a[1];
  }

  public static void swapArith(int[] a) {
    a[0] = a[0] + a[1];
    a[1] = a[0] - a[1];
    a[0] = a[0] - a[1];
  }
}
