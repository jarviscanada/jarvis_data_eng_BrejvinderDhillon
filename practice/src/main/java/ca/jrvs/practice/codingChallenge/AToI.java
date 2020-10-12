package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/String-to-Integer-atoi-89ca924b79ab42fa86daad931909e636
 */
public class AToI {

  /**
   * Big-O: O(n) Justification: the Java Integer.parseInt method iterates through the entirety of
   * the string.
   */
  public static int convertJavaApi(String str) {
    int i = 0;
    str = str.trim();

    if (str.length() == 0 || str == null) {
      return 0;
    }

    if (!Character.isDigit(str.charAt(0)) && (str.charAt(0) != '-' && str.charAt(0) != '+')) {
      return 0;
    }

    StringBuilder string = new StringBuilder();

    if (str.charAt(0) == '-' || str.charAt(0) == '+') {
      string.append(str.charAt(i++));
      if (str.length() == 1) {
        return 0;
      }
      if (!Character.isDigit(str.charAt(i))) {
        return 0;
      }
    }

    while (i < str.length() && Character.isDigit(str.charAt(i))) {
      char c = str.charAt(i++);
      string.append(c);
    }

    int result = 0;

    String stringResult = string.toString();
    try {
      result = Integer.parseInt(stringResult);
    } catch (NumberFormatException e) {
      if (str.charAt(0) == '-') {
        result = Integer.MIN_VALUE;
      } else {
        result = Integer.MAX_VALUE;
      }
    }

    return result;
  }

  /**
   * Big-O: O(n) Justification: We have to iterate through the entirety of the string.
   */
  public static int convert(String str) {
    int i = 0;
    int sign = 1;
    int result = 0;
    if (str.length() == 0) {
      return 0;
    }

    while (i < str.length() && str.charAt(i) == ' ') {
      i++;
    }

    if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
      sign = (str.charAt(i++) == '-') ? -1 : 1;
    }

    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
      if (result > Integer.MAX_VALUE / 10 ||
          (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
        return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      result = result * 10 + (str.charAt(i++) - '0');
    }
    return result * sign;
  }

}
