package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueWithStackTest {

  QueueWithStack<String> queue = new QueueWithStack<>();

  @Test
  public void enqueueApproachOne() {
    queue.enqueueApproachOne("Alice");
    queue.enqueueApproachOne("Bob");
    queue.enqueueApproachOne("Eve");

    queue.enqueueApproachOne("Faythe");
    queue.enqueueApproachOne("Grace");

    assertEquals(queue.peekApproachOne(), "Alice");
    assertEquals(queue.sizeApproachOne(), 5);
  }

  @Test
  public void dequeueApproachOne() {
    queue.enqueueApproachOne("Alice");
    queue.enqueueApproachOne("Bob");
    queue.enqueueApproachOne("Eve");

    assertEquals(queue.dequeueApproachOne(), "Alice");
    assertEquals(queue.sizeApproachOne(), 2);
    assertEquals(queue.dequeueApproachOne(), "Bob");
    assertEquals(queue.sizeApproachOne(), 1);
  }

  @Test
  public void enqueueApproachTwo() {
    queue.enqueueApproachTwo("Alice");
    queue.enqueueApproachTwo("Bob");
    queue.enqueueApproachTwo("Eve");

    queue.enqueueApproachTwo("Faythe");
    queue.enqueueApproachTwo("Grace");

    assertEquals(queue.peekApproachTwo(), "Alice");
    assertEquals(queue.sizeApproachTwo(), 5);
  }

  @Test
  public void dequeueApproachTwo() {
    queue.enqueueApproachTwo("Alice");
    queue.enqueueApproachTwo("Bob");
    queue.enqueueApproachTwo("Eve");

    assertEquals(queue.dequeueApproachTwo(), "Alice");
    assertEquals(queue.sizeApproachTwo(), 2);
    assertEquals(queue.dequeueApproachTwo(), "Bob");
    assertEquals(queue.sizeApproachTwo(), 1);
  }

}
