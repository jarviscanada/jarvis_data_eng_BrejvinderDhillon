package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Check-if-a-String-contains-only-digits-f73dcd37460849689a39b320b92df50e
 */
public class OnlyDigitsInString {

  /**
   * Big-O: O(n) Justification: We have to check all characters in the string.
   */
  public static boolean ascii(String s) {
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c < 48) || c > 57) {
        return false;
      }
    }
    return true;
  }

  /**
   * Big-O: O(n). Justification: The method goes through all chars in the string.
   */
  public static boolean usingInteger(String s) {
    if (s.isEmpty()) {
      return true;
    }

    try {
      Integer.valueOf(s);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }

  /**
   * Big-O: O(n). Justification: The method goes through all chars in the string.
   */
  public static boolean usingRegex(String s) {
    return s.matches("\\d*");
  }

}
