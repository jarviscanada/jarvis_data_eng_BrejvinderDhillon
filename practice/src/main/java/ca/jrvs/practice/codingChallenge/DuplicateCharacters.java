package ca.jrvs.practice.codingChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Ticket: https://www.notion.so/Duplicate-Characters-3b12a63d67d341c09af4d8f8d22b1800
 */
public class DuplicateCharacters {

  /**
   * Big-O: O(n), Justification: We have to iterate over the entirety of the input n, set operations
   * are O(1) so O(n).
   */
  public static Set<Character> findDuplicates(String s) {
    Set<Character> seen = new HashSet<>();
    Set<Character> result = new HashSet<>();

    int i = 0;
    while (i < s.length()) {
      char c = s.charAt(i++);
      if (c != ' ' && !seen.add(c)) {
        result.add(c);
      }
    }

    return result;
  }

}
