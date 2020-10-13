package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class DuplicateCharactersTest {

  String s1 = "A black cat";
  Set<Character> r = new HashSet<>();

  @Test
  public void findDuplicates() {
    r.add('c');
    r.add('a');
    assertEquals(r, DuplicateCharacters.findDuplicates(s1));
  }
}
