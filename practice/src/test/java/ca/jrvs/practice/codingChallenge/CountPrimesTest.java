package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountPrimesTest {

  @Test
  public void count() {
    assertEquals(0, CountPrimes.count(1));
    assertEquals(0, CountPrimes.count(2));
    assertEquals(1, CountPrimes.count(3));
    assertEquals(2, CountPrimes.count(5));
    assertEquals(4, CountPrimes.count(10));
  }
}
