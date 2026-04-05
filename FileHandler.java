
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;


/**
 * The FileHandler class handles file I/O operations for the project, including reading employee
 * and ticket data from CSV files and writing work order data to a CSV file.
 * It also includes a logger method to write timestamped entries to a log file.
 * 
 * @author Jasser Hammami
 * @version 1.0
 * @since 2025-04-20
 */


public class FileHandler {

    /** The name of the log file used for logging operations. */
    private static final String LOG_FILE = "log.txt";



     /**
      * Writes a list of work orders to a specified file in CSV format.
      *
      * @param workOrderFileName The file name to write the work orders to.
      * @param workOrders The list of WorkOrder objects to write.
      */


    public void writeData(String workOrderFileName, ArrayList<WorkOrder> workOrders){
        logger("Writing Work Order Data to File");
        
        try {

            // Create a FileWriter and PrintWriter to write to the file
            FileWriter myWriter = new FileWriter(workOrderFileName, false);
            PrintWriter write = new PrintWriter(myWriter);
            
            write.println("customer_id,customer_first_name,customer_last_name,ticket_id, ticket_created_at,work_order_created_at,employee_id,employee_first_name,employee_last_name, clocked_in,certification");
            // Write each work order’s data and log it
            for(WorkOrder workOrder : workOrders){
                write.println(workOrder.getFileData());
                logger(workOrder.getFileData());
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        logger("Word Orders Created. Program Exiting");
    }


    /**
     * Reads employee data from a file and populates the employee list.
     *
     * @param employeeFileName The name of the CSV file containing employee data.
     * @param employees The list to populate with Employee or Tier2Employee objects.
     * @throws FileNotFoundException if the file does not exist.
     */

    
    public void readEmployeeData(String employeeFileName, ArrayList<Employee> employees) throws FileNotFoundException{
        FileHandler.logger("Loading Employee Data");
        try {
            File file = new File(employeeFileName);
            Scanner sc = new Scanner(file); 
            // Skip header line if it exists
            if (sc.hasNextLine()) sc.nextLine();
             // Read and parse each line
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] employee = line.split(",");
                if(employee[8].equals("tier1")){
                    Employee employee1 = new Employee(employee[0], employee[1], employee[2], employee[3], employee[4], employee[5], employee[6], employee[7]);
                    employees.add(employee1);
                }
                else if(employee[8].equals("tier2")){
                    Tier2Employee employee1 = new Tier2Employee(employee[0], employee[1], employee[2], employee[3], employee[4], employee[5], employee[6], employee[7], employee[9]);
                    employees.add(employee1);
                }
                
            }
            
        } catch (FileNotFoundException e) {
            FileHandler.logger("ERROR: Employee file not found - " + e.getMessage());
        }


    }

    /**
     * Reads ticket data from a file and returns a list of Ticket objects.
     *
     * @param ticketFileName The name of the CSV file containing ticket data.
     * @return A LinkedList of Ticket objects.
     * @throws FileNotFoundException if the file does not exist.
     */

    public LinkedList <Ticket> readTicketData(String ticketFileName) throws FileNotFoundException{
        FileHandler.logger("Loading Ticket Data");
        LinkedList <Ticket> tickets = new LinkedList <Ticket>();
        try(Scanner sc = new Scanner(new File(ticketFileName))){
            // Skip header line
            if (sc.hasNextLine()) sc.nextLine();
            // Read and parse each line
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] ticket = line.split(",");
                Customer customer = new Customer(ticket[0], ticket[1], ticket[2], ticket[3], ticket[4], ticket[5], ticket[6]);
                Ticket ticket1 = new Ticket(customer, ticket[7], ticket[8]);
                tickets.add(ticket1);
            }
        }
        catch(FileNotFoundException e){
            FileHandler.logger("ERROR: Ticket file not found - " + e.getMessage());
        }
        return tickets;
    
    }


    /**
     * Logs a message with a timestamp to the log file.
     *
     * @param log The message to be logged.
     */

    public static void logger(String log) {
        String timestamp = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss] ").format(new Date());
        String logEntry = timestamp + log;
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(logEntry);
            writer.flush();  // Explicit flush ensures immediate write
        } catch (IOException e) {
            System.err.println("Logger error: " + e.getMessage());
            e.printStackTrace();
        }
    }  

}
