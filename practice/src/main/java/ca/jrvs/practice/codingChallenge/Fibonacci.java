package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Fibonacci-Number-Climbing-Stairs-e2e112c492a643d3b0ad96241d3d4a5a
 */
public class Fibonacci {

  /**
   * Big-O: O(2^n) Justification: Every value in the recursive tree has to be computed every time
   * even though they have been computed before. It is a tree because each call of the function has
   * 2 recursive calls or none. The height of the recursion tree would be O(n) therefore 2^n
   * calculations are performed.
   */
  public static int fibRecursive(int n) {
    if (n == 0) {
      return 0;
    }

    if (n < 3) {
      return 1;
    }

    return fibRecursive(n - 2) + fibRecursive(n - 1);
  }

  /**
   * Big-O: O(n)
   * Justification: Instead of having to recompute the values at every node of the
   * recursive tree, we can simply reference the values that have already been computed. For values
   * that haven't been computed, they are computed and put into the computed "table". Therefore,
   * every value that needs to be computed is done only once and looked up the rest of the time
   * resulting in the O(n) time complexity.
   */
  public static int fibMemoized(int n) {
    int[] computed = new int[n];
    return fibMemoizedHelper(n, computed);
  }

  private static int fibMemoizedHelper(int n, int[] computed) {
    if (n == 0) {
      return 0;
    }

    if (n < 3) {
      return 1;
    }

    if (computed[n - 1] != 0) {
      return computed[n - 1];
    }

    computed[n - 1] = fibMemoizedHelper(n - 2, computed) + fibMemoizedHelper(n - 1, computed);
    return computed[n - 1];
  }

}
