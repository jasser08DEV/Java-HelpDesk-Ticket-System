/**
 * The Customer class represents a customer and extends the Person class.
 * It includes customer-specific fields such as a customer ID and account number,
 * and provides methods to access and modify this data.
 * 
 * This class also overrides the getFileData method to return a formatted string.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */
public class Customer extends Person {

    /** The unique ID assigned to the customer. */
    private String customerID;

    /** The account number associated with the customer. */
    private String accountNumber;

    /**
     * Constructs a Customer with specified personal and account information.
     *
     * @param customerID The unique ID of the customer.
     * @param firstName The customer's first name.
     * @param lastName The customer's last name.
     * @param address The customer's address.
     * @param phoneNumber The customer's phone number.
     * @param email The customer's email address.
     * @param accountNumber The account number of the customer.
     */
    public Customer(String customerID, String firstName, String lastName, String address,String phoneNumber, String email, String accountNumber) {
        super(firstName, lastName, address, phoneNumber, email);
        this.customerID = customerID;
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the customer data formatted for file writing,
     * including the customer ID and inherited personal data.
     *
     * @return A CSV-style string representing the customer.
     */
    @Override
    public String getFileData() {
        return customerID + "," + super.getFileData();
    }

    /**
     * Gets the customer ID.
     *
     * @return The customer ID.
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the customer ID.
     *
     * @param customerID The new customer ID.
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * Gets the customer's account number.
     *
     * @return The account number.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the customer's account number.
     *
     * @param accountNumber The new account number.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
