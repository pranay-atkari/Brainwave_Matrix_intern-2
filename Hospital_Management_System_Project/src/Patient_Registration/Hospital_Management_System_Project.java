package Patient_Registration;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Hospital_Management_System_Project 
{
	 private static PatientManager patientManager = new PatientManager();
	    private static AppointmentManager appointmentManager = new AppointmentManager();
	    private static HealthRecordManager healthRecordManager = new HealthRecordManager();
	    private static InvoiceManager invoiceManager = new InvoiceManager();
	    private static InventoryManager inventoryManager = new InventoryManager();
	    private static StaffManager staffManager = new StaffManager();

	    public static <staffManager> void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Hospital Management System");
	            System.out.println("1. Register Patient");
	            System.out.println("2. Schedule Appointment");
	            System.out.println("3. Add Health Record");
	            System.out.println("4. Create Invoice");
	            System.out.println("5. Manage Inventory");
	            System.out.println("6. Manage Staff");
	            System.out.println("7. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine();  

	            switch (choice) {
	                case 1:
	                   
	                    System.out.println("Enter Patient ID:");
	                    String patientId = scanner.nextLine();
	                    System.out.println("Enter Patient Name:");
	                    String name = scanner.nextLine();
	                    System.out.println("Enter Contact Number:");
	                    String contactNumber = scanner.nextLine();
	                    System.out.println("Enter Address:");
	                    String address = scanner.nextLine();

	                    Patient patient = new Patient(patientId, name, contactNumber, address);
	                    patientManager.registerPatient(patient);
	                    System.out.println("Patient Registered: " + patient);
	                    break;

	                case 2:
	                    
	                    System.out.println("Enter Appointment ID:");
	                    String appointmentId = scanner.nextLine();
	                    System.out.println("Enter Patient ID:");
	                    String appPatientId = scanner.nextLine();
	                    System.out.println("Enter Appointment Time (YYYY-MM-DDTHH:MM):");
	                    LocalDateTime appointmentTime = LocalDateTime.parse(scanner.nextLine());
	                    System.out.println("Enter Doctor ID:");
	                    String doctorId = scanner.nextLine();

	                    Appointment appointment = new Appointment(appointmentId, appPatientId, appointmentTime, doctorId);
	                    appointmentManager.scheduleAppointment(appointment);
	                    System.out.println("Appointment Scheduled: " + appointment);
	                    break;

	                case 3:
	                  
	                    System.out.println("Enter Record ID:");
	                    String recordId = scanner.nextLine();
	                    System.out.println("Enter Patient ID:");
	                    String recordPatientId = scanner.nextLine();
	                    System.out.println("Enter Diagnosis:");
	                    String diagnosis = scanner.nextLine();
	                    System.out.println("Enter Treatment:");
	                    String treatment = scanner.nextLine();

	                    HealthRecord healthRecord = new HealthRecord(recordId, recordPatientId, diagnosis, treatment);
	                    healthRecordManager.addRecord(healthRecord);
	                    System.out.println("Health Record Added: " + healthRecord);
	                    break;

	                case 4:
	                 
	                    System.out.println("Enter Invoice ID:");
	                    String invoiceId = scanner.nextLine();
	                    System.out.println("Enter Patient ID:");
	                    String invoicePatientId = scanner.nextLine();
	                    System.out.println("Enter Amount:");
	                    double amount = scanner.nextDouble();
	                    System.out.println("Is Paid (true/false):");
	                    boolean isPaid = scanner.nextBoolean();
	                    scanner.nextLine(); 

	                    Invoice invoice = new Invoice(invoiceId, invoicePatientId, amount, isPaid);
	                    invoiceManager.createInvoice(invoice);
	                    System.out.println("Invoice Created: " + invoice);
	                    break;

	                case 5:
	                
	                    System.out.println("Enter Item ID:");
	                    String itemId = scanner.nextLine();
	                    System.out.println("Enter Item Name:");
	                    String itemName = scanner.nextLine();
	                    System.out.println("Enter Quantity:");
	                    int quantity = scanner.nextInt();
	                    System.out.println("Enter Price:");
	                    double price = scanner.nextDouble();
	                    scanner.nextLine(); 

	                    InventoryItem item = new InventoryItem(itemId, itemName, quantity, price);
	                    inventoryManager.addItem(item);
	                    System.out.println("Inventory Item Added: " + item);
	                    break;

	                case 6:
	                   
	                    System.out.println("Enter Staff ID:");
	                    String staffId = scanner.nextLine();
	                    System.out.println("Enter Staff Name:");
	                    String staffName = scanner.nextLine();
	                    System.out.println("Enter Position:");
	                    String position = scanner.nextLine();

	                    Staff staff = new Staff(staffId, staffName, position);
	                    staffManager.addStaff(staff);
	                    System.out.println("Staff Added: " + staff);
	                    break;

	                case 7:
	                    System.out.println("Exiting System...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}
