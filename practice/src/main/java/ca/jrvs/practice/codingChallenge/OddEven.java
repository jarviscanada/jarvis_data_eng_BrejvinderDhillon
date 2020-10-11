package ca.jrvs.practice.codingChallenge;

/**
 * ticket: https://www.notion.so/jarviscanada/Check-if-a-number-is-even-or-odd-4cbdd9acd9504c04b9b4ef0213f8084d
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
