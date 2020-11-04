package ca.jrvs.practice.codingChallenge;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Ticket: https://www.notion.so/Implement-Queue-using-Stacks-a360ca48a0ee4aa9b52a4208d54faf6c
 */
public class QueueWithStack<E> {

  private Deque<E> stack1;
  private Deque<E> stack2;
  private E front;

  public QueueWithStack() {
    stack1 = new LinkedList<>();
    stack2 = new LinkedList<>();
  }

  public int sizeApproachOne() {
    return stack1.size();
  }

  public int sizeApproachTwo() {
    return stack1.size() + stack2.size();
  }

  public E peekApproachOne() {
    return stack1.peekFirst();
  }

  public E peekApproachTwo() {
    if (stack2.isEmpty()) {
      return front;
    } else {
      return stack2.peekFirst();
    }
  }

  /**
   * Big-O: O(n) Justification: All elements in stack1 are popped and pushed onto stack2. The new
   * element is pushed onto stack 1 (bottom of stack - tail of queue) and elements stored in stack 2
   * are brought back.  this keeps a queue order.
   */
  public void enqueueApproachOne(E e) {
    if (stack1.isEmpty()) {
      stack1.addFirst(e);
    } else {
      while (!stack1.isEmpty()) {
        stack2.addFirst(stack1.removeFirst());
      }

      stack1.addFirst(e);

      while (!stack2.isEmpty()) {
        stack1.addFirst(stack2.removeFirst());
      }
    }
  }

  /**
   * Big-O: O(1) Justification: Stack1 is already in queue order, we just have to pop the top
   * element.
   */
  public E dequeueApproachOne() {
    return stack1.removeFirst();
  }

  /**
   * Big-O: O(1) Justification: Elements are pushed into the stack normally
   */
  public void enqueueApproachTwo(E e) {
    if (stack1.isEmpty()) {
      front = e;
    }
    stack1.addFirst(e);
  }

  /**
   * Big-O: Amortized O(1) Justification: The number of times pop operation can be called is limited
   * by the number of push operations before it. Although a single pop operation could be expensive,
   * it is expensive only once per n times (queue size), when s2 is empty and there is a need for
   * data transfer between s1 and s2. Hence the total time complexity of the sequence is : n (for
   * push operations) + 2*n (for first pop operation) + n - 1 ( for pop operations) which is
   * O(2*n).This gives O(2n/2n) = O(1) average time per operation.
   */
  public E dequeueApproachTwo() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.addFirst(stack1.removeFirst());
      }
    }
    return stack2.removeFirst();
  }

}
