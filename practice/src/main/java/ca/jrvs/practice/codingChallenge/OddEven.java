package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Sample-Check-if-a-number-is-even-or-odd-c6be2bc451264d59a5a9d5c31f6e5117
 */
public class OddEven {

  /**
   * Big-O: O(1)
   * Justification: It's one arithmetic operation
   */
  public String oddEvenMod(int i) {
    return i % 2 == 0 ? "Even" : "Odd";
  }

  /**
   * Big-O: O(1)
   * Justification: It's one bitwise operation
   */
  public String oddEvenBit(int i) {
    return ((i ^ 1) != (i + 1)) ? "Odd" : "Even";
  }

}
