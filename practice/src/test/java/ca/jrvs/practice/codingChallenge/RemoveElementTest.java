package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveElementTest {

  int[] nums, newNums;

  @Test
  public void removeElement() {
    nums = new int[]{3, 2, 2, 3};
    newNums = new int[]{2, 2};

    assertEquals(2, RemoveElement.removeElement(nums, 3));

    for (int i = 0; i < 2; i++) {
      assertEquals(newNums[i], nums[i]);
    }
  }
}
