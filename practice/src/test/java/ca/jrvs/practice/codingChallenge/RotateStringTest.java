package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotateStringTest {

  @Test
  public void rotate() {
    String A = "abcde";
    assertTrue(RotateString.rotate(A, "cdeab"));
    assertTrue(RotateString.rotate(A, "bcdea"));
    assertFalse(RotateString.rotate(A, "baced"));
  }
}