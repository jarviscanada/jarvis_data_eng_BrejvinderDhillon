package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Valid-Palindrome-78b5dbf20f0c4da1a8bc47e9dcfdcff8
 */
public class ValidPalindrome {

  private static boolean isAlphanumeric(char c) {
    return (c != ' ' && (Character.isLetter(c) || Character.isDigit(c)));
  }

  /**
   * Big-O: O(n) Justification: We traverse the entirety of the input n, and perform O(1) operations
   * at each iteration
   */
  public static boolean twoPointers(String s) {
    s = s.toLowerCase();
    char left = ' ';
    char right = ' ';
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      left = s.charAt(i);
      right = s.charAt(j);

      if (!isAlphanumeric(left)) {
        i++;
      } else if (!isAlphanumeric(right)) {
        j--;
      } else if (left != right) {
        return false;
      } else {
        i++;
        j--;
      }
    }

    return true;
  }

  /**
   * Big-O: O(n) Justification: this method calls itself at most n/2 times with O(1) operations each
   * recursion
   */
  public static boolean recursive(String s, int left, int right) {
    if (left >= right) {
      return true;
    }

    if (left == 0) {
      s = s.toLowerCase();
    }

    if (!isAlphanumeric(s.charAt(left))) {
      left++;
    } else if (!isAlphanumeric(s.charAt(right))) {
      right--;
    } else if (s.charAt(left) != s.charAt(right)) {
      return false;
    } else {
      left++;
      right--;
    }

    return (true && recursive(s, left, right));
  }

}
