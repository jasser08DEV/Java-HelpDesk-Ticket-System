/**
 * The Employee class represents a company employee and extends the Person class.
 * It includes additional attributes specific to employees, such as employee ID,
 * clock-in status, and hire date. This class provides methods to access and 
 * modify these attributes and overrides the method to format employee data.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */
public class Employee extends Person {

    /** The unique ID assigned to the employee. */
    private String employeeID;

    /** The clock-in status of the employee. */
    private String clockedIn;

    /** The date the employee was hired. */
    private String hiredDate;

    /**
     * Constructs an Employee object with personal and job-related details.
     *
     * @param employeeID The unique ID of the employee.
     * @param firstName The employee's first name.
     * @param lastName The employee's last name.
     * @param address The employee's address.
     * @param phoneNumber The employee's phone number.
     * @param email The employee's email address.
     * @param clockedIn The employee's clock-in status.
     * @param hiredDate The date the employee was hired.
     */
    public Employee(String employeeID, String firstName, String lastName, String address,String phoneNumber, String email, String clockedIn, String hiredDate) {
        super(firstName, lastName, address, phoneNumber, email);
        this.employeeID = employeeID;
        this.clockedIn = clockedIn;
        this.hiredDate = hiredDate;
    }

    /**
     * Returns the employee data formatted for file writing,
     * including the ID, inherited personal data, and clock-in status.
     *
     * @return A CSV-style string representing the employee.
     */
    @Override
    public String getFileData() {
        return employeeID + "," + super.getFileData() + "," + clockedIn;
    }

    /**
     * Gets the employee's unique ID.
     *
     * @return The employee ID.
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the employee's unique ID.
     *
     * @param employeeID The new employee ID.
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the clock-in status of the employee.
     *
     * @return The clocked-in status.
     */
    public String getClockedIn() {
        return clockedIn;
    }

    /**
     * Sets the clock-in status of the employee.
     *
     * @param clockedIn The new clocked-in value.
     */
    public void setClockedIn(String clockedIn) {
        this.clockedIn = clockedIn;
    }

    /**
     * Gets the hire date of the employee.
     *
     * @return The hire date string.
     */
    public String getHiredDate() {
        return hiredDate;
    }

    /**
     * Sets the hire date of the employee.
     *
     * @param hiredDate The new hire date string.
     */
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }
}
