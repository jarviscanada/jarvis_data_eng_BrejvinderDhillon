package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {

  int[] numbers = {3, 0, 1};

  @Test
  public void sumAll() {
    assertEquals(2, MissingNumber.sumAll(numbers));
  }

  @Test
  public void sumAllGauss() {
    assertEquals(2, MissingNumber.sumAllGauss(numbers));
  }

  @Test
  public void set() {
    assertEquals(2, MissingNumber.set(numbers));
  }
}
