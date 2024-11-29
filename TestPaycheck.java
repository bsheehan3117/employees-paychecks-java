import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * A JUnit test class for the Vector3D class.
 */

public class TestPaycheck {
  private Paycheck paycheck;

  // Setting up a test Paycheck.
  @Before
  public void setUp() {
    paycheck = new Paycheck("Brendan", 15.00, 40.00);
  }

  // Testing the constructor.
  @Test
  public void testConstructor() {

    // Test throwing an exception.
    try {
      paycheck = new Paycheck("Brendan", 15.00, -20.00);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {
      // The test passes.
    }

    try {
      paycheck = new Paycheck("Not feeling work", 15.00, 0.00);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {
      // The test passes.
    }

    // Test a functioning constructor.
    assertEquals("Brendan", paycheck.getEmployeeName());
    assertEquals(15.00, paycheck.getPayRate(), 0.0);
    assertEquals(40.00, paycheck.getHoursWorked(), 0.0);
  }

  // Testing the getTotalWeeklyPay method.
  @Test
  public void testGetTotalWeeklyPay() {
    assertEquals(600.0, paycheck.getTotalWeeklyPay(), 0.0);
  }

  // Testing the toString method.
  @Test
  public void testToString() {
    assertEquals("$600.00", paycheck.toString());
  }
}