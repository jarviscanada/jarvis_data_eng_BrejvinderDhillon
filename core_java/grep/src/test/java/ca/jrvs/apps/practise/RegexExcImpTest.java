package ca.jrvs.apps.practise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import ca.jrvs.apps.practice.RegexExcImplementation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegexExcImpTest {

  private RegexExcImplementation regexExcImp;

  @Before
  public void setUp() {
    regexExcImp = new RegexExcImplementation();
  }

  @After
  public void tearDown() {

  }

  @Test
  public void matchJpeg() {
    System.out.println("Test case: test matchJpeg method");
    Boolean bool = regexExcImp.matchJpeg("photo.jpeg");
    assertTrue("The expected output is true", bool);
    bool = regexExcImp.matchJpeg("photo.jpg");
    assertTrue("The expected output is true", bool);
    bool = regexExcImp.matchJpeg("photo.png");
    assertFalse("The expected output is false", bool);
  }

  @Test
  public void matchIp() {
    System.out.println("Test case: test matchIp method");
    Boolean bool = regexExcImp.matchIp("192.168.0.1");
    assertTrue("The expected output is true", bool);
    bool = regexExcImp.matchIp("0.0.0");
    assertFalse("The expected output is false", bool);
  }

  @Test
  public void isEmptyLine() {
    System.out.println("Test case: test isEmptyLine method");
    Boolean bool = regexExcImp.isEmptyLine(" ");
    assertTrue("The expected output is true", bool);
    bool = regexExcImp.isEmptyLine("abc");
    assertFalse("The expected output is false", bool);
  }
}
