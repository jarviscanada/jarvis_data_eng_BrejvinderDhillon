package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OnlyDigitsInStringTest {

  String digits = "123456";
  String digits2 = "987654";
  String nonDigits = "123.456";
  String nonDigits2 = "1,234Hello";
  String empty = "";

  @Test
  public void ascii() {
    assertTrue(OnlyDigitsInString.ascii(digits));
    assertTrue(OnlyDigitsInString.ascii(digits2));
    assertTrue(OnlyDigitsInString.ascii(empty));
    assertFalse(OnlyDigitsInString.ascii(nonDigits));
    assertFalse(OnlyDigitsInString.ascii(nonDigits2));
  }

  @Test
  public void usingInteger() {
    assertTrue(OnlyDigitsInString.usingInteger(digits));
    assertTrue(OnlyDigitsInString.usingInteger(digits2));
    assertTrue(OnlyDigitsInString.usingInteger(empty));
    assertFalse(OnlyDigitsInString.usingInteger(nonDigits));
    assertFalse(OnlyDigitsInString.usingInteger(nonDigits2));
  }

  @Test
  public void usingRegex() {
    assertTrue(OnlyDigitsInString.usingRegex(digits));
    assertTrue(OnlyDigitsInString.usingRegex(digits2));
    assertTrue(OnlyDigitsInString.usingRegex(empty));
    assertFalse(OnlyDigitsInString.usingRegex(nonDigits));
    assertFalse(OnlyDigitsInString.usingRegex(nonDigits2));
  }
}
