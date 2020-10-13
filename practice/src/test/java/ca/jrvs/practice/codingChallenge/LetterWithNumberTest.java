package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterWithNumberTest {

  @Test
  public void stringWithNums() {
    String input = "abcde";
    String expected = "a1b2c3d4e5";
    assertEquals(expected, LetterWithNumber.letterWithNumberss(input));

    input = "ABCD";
    expected = "A27B28C29D30";
    assertEquals(expected, LetterWithNumber.letterWithNumberss(input));
  }
}
