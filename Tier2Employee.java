/**
 * The Tier2Employee class extends the Employee class and represents
 * a Tier 2 support employee. It includes an additional certification field
 * and overrides the method to return file data.
 * 
 * This subclass is used to differentiate Tier 2 employees from Tier 1 employees.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */
public class Tier2Employee extends Employee {

    /** The certification held by the Tier 2 employee. */
    private String certification;

    /**
     * Constructs a Tier2Employee with inherited fields and certification.
     *
     * @param firstName The employee's first name.
     * @param lastName The employee's last name.
     * @param address The employee's address.
     * @param phoneNumber The employee's phone number.
     * @param email The employee's email address.
     * @param employeeID The unique ID of the employee.
     * @param clockedIn The clock-in status of the employee.
     * @param hiredDate The date the employee was hired.
     * @param certification The certification of the Tier 2 employee.
     */
    public Tier2Employee(String firstName, String lastName, String address, String phoneNumber, String email,String employeeID, String clockedIn, String hiredDate, String certification) {
        super(firstName, lastName, address, phoneNumber, email, employeeID, clockedIn, hiredDate);
        this.certification = certification;
    }

    /**
     * Returns a string containing the employee's data formatted for file writing,
     * including inherited fields and the certification.
     *
     * @return A CSV-style string representing the Tier2Employee.
     */
    @Override
    public String getFileData() {
        return super.getFileData() + "," + certification;
    }

    /**
     * Sets the certification for the Tier 2 employee.
     *
     * @param certification The new certification value.
     */
    public void setCertification(String certification) {
        this.certification = certification;
    }

    /**
     * Gets the certification of the Tier 2 employee.
     *
     * @return The current certification value.
     */
    public String getCertification() {
        return certification;
    }
}
