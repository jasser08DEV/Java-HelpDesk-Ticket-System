/**
 * The Ticket class represents a customer support ticket.
 * It includes information about the customer, the ticket ID,
 * and the creation timestamp.
 * 
 * This class provides methods to access and modify these values,
 * and to retrieve the ticket data in a formatted string.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */
public class Ticket {

    /** The customer who submitted the ticket. */
    private Customer customer;

    /** The timestamp when the ticket was created. */
    private String createdAt;

    /** The unique ID of the ticket. */
    private String ticketId;

    /**
     * Constructs a Ticket with a given customer, ticket ID, and creation time.
     *
     * @param customer The customer who created the ticket.
     * @param ticketId The unique ID assigned to the ticket.
     * @param createdAt The creation time of the ticket.
     */
    public Ticket(Customer customer, String ticketId, String createdAt) {
        this.customer = customer;
        this.createdAt = createdAt;
        this.ticketId = ticketId;
    }

    /**
     * Returns the ticket data formatted for file writing.
     *
     * @return A CSV-style string with customer info, ticket ID, and creation time.
     */
    public String getFileData() {
        return customer.getFileData() + "," + ticketId + "," + createdAt;
    }

    /**
     * Gets the customer associated with the ticket.
     *
     * @return The Customer object.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets the ticket's unique ID.
     *
     * @return The ticket ID.
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Gets the creation time of the ticket.
     *
     * @return The creation timestamp string.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the customer associated with the ticket.
     *
     * @param customer The new Customer object.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Sets the ticket's unique ID.
     *
     * @param ticketId The new ticket ID.
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Sets the ticket's creation timestamp.
     *
     * @param createdAt The new creation time string.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

