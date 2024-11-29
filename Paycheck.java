/**
 * This class represents a paycheck.  The paycheck has a name,
 * pay rate, hours worked, and total weekly pay.
 */

public class Paycheck {
  private String employeeName;
  private double payRate;
  private double hoursWorked;
  private double totalWeeklyPay;

  /**
   * Constructs a Paycheck object and initializes it
   * to the given name, pay rate, and hours worked.
   *     @param employeeName The name of the employee.
   *     @param payRate The Employee's amount earned per hour.
   *     @param hoursWorked The number of hours worked by the employee.
   *     @throws IllegalArgumentException if the hours are negative.
   */

  public Paycheck(String employeeName, double payRate, double hoursWorked) {
    if (hoursWorked <= 0) {
      throw new IllegalArgumentException("Can't" +
              " work negative hours.");
    }

    this.employeeName = employeeName;
    this.payRate = payRate;
    this.hoursWorked = hoursWorked;
    this.totalWeeklyPay = payRate * hoursWorked;
  }

  /**
   * Get the name of the Employee.
   *     @return The name of the Employee.
   */

  public String getEmployeeName() {
    return this.employeeName;
  }

  /**
   * Get the pay rate of the employee.
   *     @return The pay rate of the employee.
   */

  public double getPayRate() {
    return this.payRate;
  }

  /**
   * Get the hours worked of the employee.
   *
   *     @return The hours worked of the employee.
   */

  public double getHoursWorked() {
    return this.hoursWorked;
  }

  /**
   * Returns the total weekly pay as a double.
   * @return The total weekly pay as a double.
   */
  public double getTotalWeeklyPay() {

    return this.totalWeeklyPay;
  }

  /**
   * Returns a string representation of the Paycheck.
   *     @return A string representation of the Paycheck.
   */

  public String toString() {
    String str;

    str = "$" + String.format("%.2f", this.totalWeeklyPay);

    return str;
  }
}