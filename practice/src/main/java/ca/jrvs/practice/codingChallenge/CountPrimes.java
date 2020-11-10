package ca.jrvs.practice.codingChallenge;

/**
 * Ticket: https://www.notion.so/Count-Primes-3093671ba54c411a9b0f98cbf8a4b162
 */
public class CountPrimes {

  /**
   * Big-O: O(nloglogn) Justification: The Sieve of Eratosthenes is one of the most efficient ways
   * to find all prime numbers up to n; it runs in O(nloglogn) and uses an array to mark numbers
   * prime or non-prime.
   */
  public static int count(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }

  private static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }

    for (int i = 2; (i * i) <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

}
