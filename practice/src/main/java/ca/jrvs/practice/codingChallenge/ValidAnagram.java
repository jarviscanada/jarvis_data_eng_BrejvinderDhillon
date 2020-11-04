package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;

/**
 * Ticket: https://www.notion.so/Valid-Anagram-89964c1d7eb1448b89f39f0e7723cd24
 */
public class ValidAnagram {

  /**
   * Big-O: O(nlog(n)). Justification: The biggest factor w.r.t to efficiency is the sorting
   * therefore it's O(nlog(n)) by the definition of Big-O
   */
  public static boolean sorting(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
  }

  /**
   * Big-O: O(n) Justification: Both string s and t are scanned in their entirety so O(2n) -> O(n).
   * Array access is O(1)
   */
  public static boolean table(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {
      counter[s.charAt(i) - 'a']++;
      counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }

}
