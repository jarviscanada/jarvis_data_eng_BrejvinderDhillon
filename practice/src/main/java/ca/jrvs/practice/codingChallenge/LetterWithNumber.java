package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Print-letter-with-number-a6d18cbf7e4c468381bb3ee2ca439e77
 */
public class LetterWithNumber {

  /**
   * Big-O: O(n) Justification: We have to iterate over all chars in input string.
   */
  public static String letterWithNumberss(String s) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      result.append(c);
      if (c < 'a') {
        result.append(c - 'A' + 1 + 26);
      } else {
        result.append(c - 'a' + 1);
      }
    }

    return result.toString();
  }

}
