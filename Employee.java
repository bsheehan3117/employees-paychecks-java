/**
 * This class represents an employee.
 * The employee has name and a pay rate.
 * The initial hours worked of the employee is zero.
 */

public class Employee {
  private double hoursWorked;
  private double payRate;
  private String employeeName;

  /**
   * Constructs an Employee object and intitializes it
   * to the given hours worked, pay rate, and employee name.
   *     @param payRate The amount per hour of pay.
   *     @param employeeName The name of the employee.
   *     @throws IllegalArgumentException If the pay rate is less
   *     than or equal to zero.
   */

  public Employee(String employeeName, double payRate)
          throws IllegalArgumentException {
    if (payRate <= 0) {
      throw new IllegalArgumentException("Pay rate " +
              "must be greater than $0.");
    }

    this.hoursWorked = 0;
    this.payRate = payRate;
    this.employeeName = employeeName;
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
   *     @return The hours worked of the employee.
   */

  public double getHoursWorked() {
    return this.hoursWorked;
  }

  /**
   * Takes as a parameter the number of hours an employee has
   * worked and adds it to the running total number of
   * hours the employee has worked this week. Returns
   * the total number of hours worked.
   */

  public void addHoursWorked(double hoursWorked) {

    this.hoursWorked += hoursWorked;
  }

  /**
   * Resets the number of hours worked in a week to zero.
   */

  public void resetHoursWorked() {
    this.hoursWorked = 0;
  }

  /**
   * Returns a string representation of the employee's
   * name.
   *     @return A string representation of the
   *     employee's name.
   */

  public String toString() {

    String str;

    str = this.employeeName;

    return str;
  }

  /**
   * Returns a new Paycheck object with the employee name,
   * pay rate, and hours worked.
   *     @return A paycheck object with the employee name,
   *     pay rate, and hours worked.
   */
  public Paycheck getWeeklyCheck() {

    Paycheck check = new Paycheck(this.employeeName, this.payRate, this.hoursWorked);

    return check;
  }
}
