package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StackWithQueueTest {

  StackWithQueue<String> stack;

  @Before
  public void setUp() throws Exception {
    stack = new StackWithQueue<>();
    stack.pushTwoQueues("Alice");
    stack.pushTwoQueues("Bob");
    stack.pushTwoQueues("Eve");

    stack.pushOneQueue("Alice");
    stack.pushOneQueue("Bob");
    stack.pushOneQueue("Eve");
  }

  @Test
  public void pushTwoQueues() {
    stack.pushTwoQueues("Faythe");
    stack.pushTwoQueues("Grace");
    assertEquals("Grace", stack.peekTwoQueues());
    assertEquals(5, stack.sizeTwoQueues());
  }

  @Test
  public void popTwoQueues() {
    assertEquals("Eve", stack.popTwoQueues());
    assertEquals(2, stack.sizeTwoQueues());
    assertEquals("Bob", stack.popTwoQueues());
    assertEquals(1, stack.sizeTwoQueues());
  }

  @Test
  public void pushOneQueue() {
    stack.pushOneQueue("Faythe");
    stack.pushOneQueue("Grace");
    assertEquals("Grace", stack.peekOneQueue());
    assertEquals(5, stack.sizeOneQueue());
  }

  @Test
  public void popOneQueue() {
    assertEquals("Eve", stack.popOneQueue());
    assertEquals(2, stack.sizeOneQueue());
    assertEquals("Bob", stack.popOneQueue());
    assertEquals(1, stack.sizeOneQueue());
  }
}
