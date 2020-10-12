package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AToITest {

  @Test
  public void convertJavaApi() {
    assertEquals(AToI.convertJavaApi("   -123"), -123);
    assertEquals(AToI.convertJavaApi("+-1234"), 0);
    assertEquals(AToI.convertJavaApi("Hello World"), 0);
    assertEquals(AToI.convertJavaApi("-98147483648"), -2147483648);
    assertEquals(AToI.convertJavaApi("+123"), 123);
  }

  @Test
  public void convert() {
    assertEquals(AToI.convert("   -123"), -123);
    assertEquals(AToI.convert("+-1234"), 0);
    assertEquals(AToI.convert("Hello World"), 0);
    assertEquals(AToI.convert("-98147483648"), -2147483648);
    assertEquals(AToI.convert("+123"), 123);
  }
}