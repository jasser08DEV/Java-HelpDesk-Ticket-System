/**
 * The Person class represents a generic person with common attributes such as
 * name, address, phone number, and email. It implements the Printable interface
 * and provides methods for accessing and modifying these fields.
 * 
 * This class serves as a base class for other entities like Employee and Customer.
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */
public class Person implements Printable {

    /** The first name of the person. */
    private String firstName;

    /** The last name of the person. */
    private String lastName;

    /** The address of the person. */
    private String address;

    /** The phone number of the person. */
    private String phoneNumber;

    /** The email address of the person. */
    private String email;

    /**
     * Constructs a Person with the given personal details.
     *
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @param address The address of the person.
     * @param phoneNumber The phone number of the person.
     * @param email The email address of the person.
     */
    public Person(String firstName, String lastName, String address, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Returns a formatted string with the person's name for file writing.
     *
     * @return A CSV-style string containing the first and last name.
     */
    public String getFileData() {
        return firstName + "," + lastName;
    }

    /**
     * Gets the first name of the person.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the person.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the address of the person.
     *
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number of the person.
     *
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the email address of the person.
     *
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the first name of the person.
     *
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the person.
     *
     * @param lastName The new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the address of the person.
     *
     * @param address The new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the phone number of the person.
     *
     * @param phoneNumber The new phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the email address of the person.
     *
     * @param email The new email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
