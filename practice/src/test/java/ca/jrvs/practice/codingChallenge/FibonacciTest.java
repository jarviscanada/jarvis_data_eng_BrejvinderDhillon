package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fibRecursive() {
    assertEquals(0, Fibonacci.fibRecursive(0));
    assertEquals(1, Fibonacci.fibRecursive(1));
    assertEquals(1, Fibonacci.fibRecursive(2));
    assertEquals(2, Fibonacci.fibRecursive(3));
    assertEquals(21, Fibonacci.fibRecursive(8));
    assertEquals(55, Fibonacci.fibRecursive(10));
  }

  @Test
  public void fibMemoized() {
    assertEquals(0, Fibonacci.fibRecursive(0));
    assertEquals(1, Fibonacci.fibRecursive(1));
    assertEquals(1, Fibonacci.fibRecursive(2));
    assertEquals(2, Fibonacci.fibRecursive(3));
    assertEquals(21, Fibonacci.fibRecursive(8));
    assertEquals(55, Fibonacci.fibRecursive(10));
  }
}
