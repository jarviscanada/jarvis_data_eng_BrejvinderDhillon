package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateNumberTest {

  int[] nums1 = {1, 3, 4, 2, 2};
  int[] nums2 = {3, 1, 3, 4, 2};

  @Test
  public void sorting() {
    assertEquals(2, DuplicateNumber.sorting(nums1));
    assertEquals(3, DuplicateNumber.sorting(nums2));
  }

  @Test
  public void set() {
    assertEquals(2, DuplicateNumber.set(nums1));
    assertEquals(3, DuplicateNumber.set(nums2));
  }
}
