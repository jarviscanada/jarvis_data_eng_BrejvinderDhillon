package ca.jrvs.practice.dataStructure.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayJListTest {

  @Test
  public void add() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    assertEquals(list.get(0), "first");
  }

  @Test
  public void toArray() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    list.add("second");
    assertEquals(list.toArray(), new String[]{"first", "second"});
  }

  @Test
  public void size() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    assertEquals(list.size(), 1);
  }

  @Test
  public void isEmpty() {
    JList<String> list = new ArrayJList<>();
    assertTrue(list.isEmpty());
    list.add("first");
    assertFalse(list.isEmpty());
  }

  @Test
  public void indexOf() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    assertEquals(list.indexOf("first"), 0);
    assertEquals(list.indexOf("second"), -1);
  }

  @Test
  public void contains() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    assertTrue(list.contains("first"));
    assertFalse(list.contains("second"));
  }

  @Test
  public void get() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    assertEquals(list.get(0), "first");
  }

  @Test
  public void remove() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    assertEquals(list.remove(0), "first");
  }

  @Test
  public void clear() {
    JList<String> list = new ArrayJList<>();
    list.add("first");
    list.clear();
    assertEquals(list.size(), 0);
  }
}
