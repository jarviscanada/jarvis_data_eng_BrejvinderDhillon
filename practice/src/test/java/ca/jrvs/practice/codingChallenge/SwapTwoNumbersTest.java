package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwapTwoNumbersTest {

  int[] a;

  @Test
  public void swapBit() {
    a = new int[]{10, 20};
    SwapTwoNumbers.swapBit(a);
    assertEquals(20, a[0]);
    assertEquals(10, a[1]);

  }

  @Test
  public void swapArith() {
    a = new int[]{10, 20};
    SwapTwoNumbers.swapArith(a);
    assertEquals(20, a[0]);
    assertEquals(10, a[1]);
  }
}
