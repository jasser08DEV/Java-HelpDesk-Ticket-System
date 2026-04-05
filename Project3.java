import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Project3 is the main class that manages reading employee and ticket data,
 * processes the tickets by assigning them to employees, and generates work orders.
 * It interacts with file handling utilities and uses various data structures 
 * to simulate a help desk ticket processing system.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */

public class Project3 {
     /** The file name of the employee data CSV file. */
     static String employeeFileName = "employee_data.csv";

     /** The file name of the Tier 1 ticket data CSV file. */
     static String tier1TicketFileName = "tier1_ticket_data.csv";
 
     /** The file name of the Tier 2 ticket data CSV file. */
     static String tier2TicketFileName = "tier2_ticket_data.csv";
 
     /** The file name to write the work orders to. */
     static String workOrderFileName = "workorder_data.csv";
 
     /** List that stores all employees. */
     static ArrayList<Employee> employees = new ArrayList<Employee>();
 
     /** Queue that stores Tier 1 tickets. */
     static Queue<Ticket> tier1Tickets = new LinkedList<Ticket>();
 
     /** Queue that stores Tier 2 tickets. */
     static Queue<Ticket> tier2Tickets = new LinkedList<Ticket>();
 
     /** List that stores generated work orders. */
     static ArrayList<WorkOrder> workOrders = new ArrayList<WorkOrder>();
 
     /** FileHandler object to read and write data. */
     static FileHandler fileHandler = new FileHandler();


    /**
     * The main method reads input data, processes tickets, and writes out work orders.
     *
     * @param args Command-line arguments.
     * @throws FileNotFoundException if any of the data files are not found.
     */

    public static void main(String[] args) throws FileNotFoundException {
        
        fileHandler.readEmployeeData(employeeFileName, employees);
        tier1Tickets = fileHandler.readTicketData(tier1TicketFileName);
        tier2Tickets = fileHandler.readTicketData(tier2TicketFileName);
        createWorkOrders();
        fileHandler.writeData(workOrderFileName, workOrders);
        

        
    }

    /**
     * Assigns tickets to available employees based on their tier and 
     * creates corresponding work orders.
     */

    public static void createWorkOrders() {

        while (!tier2Tickets.isEmpty() || !tier1Tickets.isEmpty()) {
        for (Employee emp : employees) {
            if (emp instanceof Tier2Employee) {
                if(!tier2Tickets.isEmpty()){
                    Ticket ticket = tier2Tickets.remove();
                    String createdAt =  new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss] ").format(new Date());
                    WorkOrder workOrder = new WorkOrder(ticket, emp, createdAt);
                    workOrders.add(workOrder);
                    
                }
                
            }
            else {
                if(!tier1Tickets.isEmpty()){
                    Ticket ticket = tier1Tickets.remove();
                    String createdAt =  new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss] ").format(new Date());
                    WorkOrder workOrder = new WorkOrder(ticket, emp, createdAt);
                    workOrders.add(workOrder);
                    
                }
            }
        }
    }
}
}