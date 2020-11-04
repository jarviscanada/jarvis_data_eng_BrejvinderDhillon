package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Rotate-String-4e03f683ee8b4ce4a0511402ce2d1e54
 */
public class RotateString {

  /**
   * Big-O: O(n^2). The .contains() method uses the indexOf method which is O(n) for each input n so
   * n*x so O(n^2)
   */
  public static boolean rotate(String A, String B) {
    return A.length() == B.length() && (A + A).contains(B);
  }

}
