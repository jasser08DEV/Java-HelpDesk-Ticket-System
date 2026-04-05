/**
 * The WorkOrder class represents a pairing of a Ticket and an Employee,
 * recording when the work order was created. It provides methods to access
 * and modify the ticket, employee, and creation timestamp.
 * 
 * This class implements the Printable interface for potential output use.
 * 
 * @author jasser hammami
 * @version 1.0
 * @since 2025-04-20
 */
public class WorkOrder implements Printable {

    /** The ticket associated with this work order. */
    private Ticket ticket;

    /** The employee assigned to handle the ticket. */
    private Employee employee;

    /** The timestamp when the work order was created. */
    private String createdAt;

    /**
     * Constructs a WorkOrder object with a given ticket, employee, and creation time.
     *
     * @param ticket The ticket being processed.
     * @param employee The employee assigned to the ticket.
     * @param createdAt The timestamp of work order creation.
     */
    public WorkOrder(Ticket ticket, Employee employee, String createdAt) {
        this.ticket = ticket;
        this.employee = employee;
        this.createdAt = createdAt;
    }

    /**
     * Returns the work order data formatted for file writing.
     *
     * @return A CSV-style String containing ticket, creation time, and employee info.
     */
    public String getFileData() {
        return ticket.getFileData() + "," + createdAt + "," + employee.getFileData();
    }

    /**
     * Sets the ticket associated with the work order.
     *
     * @param ticket The new ticket to assign.
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * Sets the employee assigned to the work order.
     *
     * @param employee The new employee to assign.
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * Sets the creation timestamp of the work order.
     *
     * @param createdAt The new creation time string.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the ticket associated with the work order.
     *
     * @return The current Ticket object.
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * Gets the employee assigned to the work order.
     *
     * @return The current Employee object.
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Gets the creation timestamp of the work order.
     *
     * @return The creation time string.
     */
    public String getCreatedAt() {
        return createdAt;
    }
}
