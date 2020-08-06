package ca.jrvs.practice.dataStructure.stackQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedJListDequeTest {

  JDeque<String> data;

  @Before
  public void setUp() {
    data = new LinkedJListDeque<>();
    data.add("Bob");
    data.add("Alice");
    data.add("Tom");
  }

  @Test
  public void add() {
    assertTrue(data.add("Eve"));
    assertEquals("Bob", data.peek());
  }

  @Test
  public void remove() {
    assertEquals("Bob", data.remove());
    assertEquals("Alice", data.peek());
  }

  @Test
  public void pop() {
    assertEquals("Tom", data.pop());
    assertEquals("Bob", data.peek());
  }

  @Test
  public void push() {
    data.push("Carol");
    assertEquals("Bob", data.peek());
    assertEquals("Carol", data.pop());
  }

  @Test
  public void peek() {
    assertEquals("Bob", data.peek());
  }
}