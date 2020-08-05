package ca.jrvs.practice.dataStructure.list;

public class LinkedJList<E> implements JList<E>{

  public static class Node<E> {

    public E element;
    public Node next;
    public Node previous;

    public Node(E element) {
      this.element = element;
      this.next = null;
      this.previous = null;
    }
  }

  private Node first = null;
  private Node last = null;
  private int size = 0;

  /**
   * Appends the specified element to the end of this list (optional operation).
   *
   * @param e element to be appended to this list
   * @return <tt>true</tt> (as specified by {@link Collection#add})
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements
   */
  @Override
  public boolean add(E e) {
    if (e == null) {
      throw new NullPointerException("This list does not accept null elements");
    }
    Node node = new Node(e);
    if (size == 0) {
      first = last = node;
    } else {
      node.previous = last;
      last.next = node;
      last = node;
    }
    size++;
    return true;
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element).
   *
   * <p>This method acts as bridge between array-based and collection-based
   * APIs.
   *
   * @return an array containing all of the elements in this list in proper sequence
   */
  @Override
  public Object[] toArray() {
    Object[] array = new Object[size];
    Node<E> e = first;
    for (int i = 0; i < size; i++) {
      array[i] = e.element;
      e = e.next;
    }
    return array;
  }

  /**
   * The size of the ArrayList (the number of elements it contains).
   */
  @Override
  public int size() {
    return size;
  }

  /**
   * Returns <tt>true</tt> if this list contains no elements.
   *
   * @return <tt>true</tt> if this list contains no elements
   */
  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns the index of the first occurrence of the specified element in this list, or -1 if this
   * list does not contain the element. More formally, returns the lowest index <tt>i</tt> such
   * that
   * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
   * or -1 if there is no such index.
   *
   * @param o
   */
  @Override
  public int indexOf(Object o) {
    int index = 0;
    Node<E> e = first;
    while (e != null) {
      if (o.equals(e.element)) {
        return index;
      }
      index++;
      e = e.next;
    }
    return -1;
  }

  /**
   * Returns <tt>true</tt> if this list contains the specified element. More formally, returns
   * <tt>true</tt> if and only if this list contains at least one element <tt>e</tt> such that
   * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
   *
   * @param o element whose presence in this list is to be tested
   * @return <tt>true</tt> if this list contains the specified element
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements
   */
  @Override
  public boolean contains(Object o) {
    return indexOf(o) != -1;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range (<tt>index &lt; 0 || index &gt;=
   *                                   size()</tt>)
   */
  @Override
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("index is out of range");
    }
    Node<E> e = getNode(index);
    return e.element;
  }

  private Node getNode(int index) {
    Node<E> e;
    if (index < size/2) {
      e = first;
      while (index-- > 0) {
        e = e.next;
      }
    } else {
      e = last;
      while (++index < size) {
        e = e.previous;
      }
    }
    return e;
  }

  /**
   * Removes the element at the specified position in this list. Shifts any subsequent elements to
   * the left (subtracts one from their indices).
   *
   * @param index the index of the element to be removed
   * @return the element that was removed from the list
   * @throws IndexOutOfBoundsException {@inheritDoc}
   */
  @Override
  public E remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("index is out of range");
    }
    Node<E> e = getNode(index);
    removeNode(e);
    return e.element;
  }

  private void removeNode(Node<E> e) {
    size--;
    if (size == 0) {
      first = last = null;
    } else {
      if (e == first) {
        first = e.next;
        e.next.previous = null;
      } else if (e == last) {
        last = e.previous;
        e.previous.next = null;
      } else {
        e.next.previous = e.previous;
        e.previous.next = e.next;
      }

    }
  }

  /**
   * Removes all of the elements from this list (optional operation). The list will be empty after
   * this call returns.
   */
  @Override
  public void clear() {
    if (size > 0) {
      first = null;
      last = null;
      size = 0;
    }
  }
}
