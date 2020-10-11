package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenTest {

  @Test
  public void oddEvenMod() {
    OddEven oddEven = new OddEven();
    assertEquals("Odd", oddEven.oddEvenMod(3));
    assertEquals("Even", oddEven.oddEvenMod(8));
  }

  @Test
  public void oddEvenBit() {
    OddEven oddEven = new OddEven();
    assertEquals("Odd", oddEven.oddEvenBit(17));
    assertEquals("Even", oddEven.oddEvenBit(6));
  }
}
