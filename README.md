# Help Desk Ticket Processing System

This repository contains a Java-based simulation of a help desk ticket management system. The application processes Tier 1 and Tier 2 support tickets by assigning them to qualified employees and generating detailed work orders in CSV format.

## ## Project Overview

The system automates the workflow of a support desk by:
* **Data Ingestion**: Reading employee and ticket data from external CSV files.
* **Tiered Logic**: Distinguishing between standard employees and Tier 2 specialists who hold specific certifications.
* **Ticket Assignment**: Processing ticket queues and pairing them with available personnel.
* **Output Generation**: Exporting finalized work orders and maintaining a timestamped execution log (`log.txt`).

---

## ## Technical Architecture

### ### Core Components
* **`Project3.java`**: The main entry point that orchestrates the reading, processing, and writing phases.
* **`FileHandler.java`**: Manages all I/O operations, including CSV parsing and the system logger.
* **`WorkOrder.java`**: Encapsulates the relationship between a `Ticket`, an assigned `Employee`, and the time of assignment.

### ### Data Model (Inheritance)
The project utilizes a robust class hierarchy to manage entities:
* **`Person`**: Base class implementing `Printable`, containing shared attributes like name and contact info.
    * **`Customer`**: Extends `Person` with unique IDs and account numbers.
    * **`Employee`**: Extends `Person` with IDs, hire dates, and clock-in status.
        * **`Tier2Employee`**: A specialized `Employee` subclass featuring technical certifications.

---

## ## File Structure & Data Formats

### ### Input Files
The system expects the following CSV files in the root directory:
* **`employee_data.csv`**: Contains employee profiles, including their tier (tier1 or tier2).
* **`tier1_ticket_data.csv`**: A queue of standard support requests.
* **`tier2_ticket_data.csv`**: A queue of advanced support requests requiring specialized personnel.

### ### Output Files
* **`workorder_data.csv`**: The final report containing merged data: `customer_id`, `customer_names`, `ticket_id`, `timestamps`, `employee_id`, and `certifications`.
* **`log.txt`**: A persistent log tracking every operation and error within the system.

---

## ## Requirements

* **Java Development Kit (JDK)**: 8 or higher.
* **Development Environment**: Any Java-supported IDE (IntelliJ, Eclipse, VS Code) or command-line interface.

---

## ## Usage

1.  **Prepare Data**: Ensure your `.csv` files are populated and located in the same directory as the `.class` files.
2.  **Compile**:
    ```bash
    javac *.java
    ```
3.  **Run**:
    ```bash
    java Project3
    ```

---

## ## Author
**Jasser Hammami**
* **Version**: 1.0
* **Date**: 2025-04-20
