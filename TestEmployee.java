import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * A JUnit test for the Employee class.
 */

public class TestEmployee {

  private Employee brendan;

  @Before
  public void setUp() {
    brendan = new Employee("Brendan", 15.00);
  }

  // Test the constructor.
  @Test
  public void testConstructEmployee() {

    Employee freeLabor;

    assertEquals("Brendan", brendan.getEmployeeName());
    assertEquals(15.00, brendan.getPayRate(), 0.0);
    assertEquals(0.0, brendan.getHoursWorked(), 0.0);

    // Test the exception.
    try {
      freeLabor = new Employee("freeLabor", 0.00);
      fail("An exception should have been thrown.");
    } catch (IllegalArgumentException e) {
      // Do nothing, the test passes.
    }
  }

  // Test the addHoursWorked method.
  @Test
  public void testAddHoursWorked() {
    // Test adding to zero.
    brendan.addHoursWorked(5.0);
    assertEquals(5.0, brendan.getHoursWorked(), 0.0);

    // Test that hours are stored and can add more.
    brendan.addHoursWorked(30.25);
    assertEquals(35.25, brendan.getHoursWorked(), 0.0);
  }

  // Test the resetHoursWorked method.
  @Test
  public void testResetHoursWorked() {
    // Create an employee and add hours.
    Employee emily = new Employee("Emily", 10.00);
    emily.addHoursWorked(10.0);
    // Confirm hours added.
    assertEquals(10.0, emily.getHoursWorked(), 0.0);
    emily.resetHoursWorked();
    // Confirm hours reset.
    assertEquals(0.0, emily.getHoursWorked(), 0.0);
  }

  // Test the toString method.
  @Test
  public void testToString() {
    assertEquals("Brendan", brendan.toString());
  }

  // Test the getWeeklyCheck method.
  @Test
  public void testGetWeeklyCheck() {

    brendan.addHoursWorked(10.00);
    Paycheck payCheck = brendan.getWeeklyCheck();
    assertEquals(15.00, payCheck.getPayRate(), 0.0);
    assertEquals("Brendan", payCheck.getEmployeeName());
    assertEquals(150.00, payCheck.getTotalWeeklyPay(), 0.0);
    assertEquals(10.00, payCheck.getHoursWorked(), 0.0);
  }
}