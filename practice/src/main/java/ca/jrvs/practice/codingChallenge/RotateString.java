package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Rotate-String-4e03f683ee8b4ce4a0511402ce2d1e54
 */
public class RotateString {

  public static boolean rotate(String A, String B) {
    return A.length() == B.length() && (A + A).contains(B);
  }

}
