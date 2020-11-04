package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidAnagramTest {

  String
      str1 = "anagram",
      str2 = "ragmana",
      str3 = "Alice";

  @Test
  public void sorting() {
    assertTrue(ValidAnagram.sorting(str1, str2));
    assertFalse(ValidAnagram.sorting(str1, str3));
  }

  @Test
  public void table() {
    assertTrue(ValidAnagram.table(str1, str2));
    assertFalse(ValidAnagram.table(str1, str3));
  }
}
