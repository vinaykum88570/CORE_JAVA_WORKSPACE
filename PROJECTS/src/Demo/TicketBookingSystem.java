package Demo;

import java.util.List;
import java.util.Scanner;

//Main class
public class TicketBookingSystem {
 private static Scanner scanner = new Scanner(System.in);
 private static UserRepository userRepo = new UserRepository();
 private static TicketRepository ticketRepo = new TicketRepository();
 private static User currentUser = null;
 
 public static void main(String[] args) {
     System.out.println("🚆 Welcome to Ticket Booking System 🚆");
     showMainMenu();
 }
 
 private static void showMainMenu() {
     while (true) {
         System.out.println("\n=== MAIN MENU ===");
         System.out.println("1. Login");
         System.out.println("2. Register as Passenger");
         System.out.println("3. Exit");
         System.out.print("Choose option: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine(); // consume newline
         
         switch (choice) {
             case 1:
                 login();
                 break;
             case 2:
                 registerPassenger();
                 break;
             case 3:
                 System.out.println("Thank you for using Ticket Booking System!");
                 return;
             default:
                 System.out.println("Invalid option! Please try again.");
         }
     }
 }
 
 private static void login() {
     System.out.println("\n=== LOGIN ===");
     System.out.print("Username: ");
     String username = scanner.nextLine();
     System.out.print("Password: ");
     String password = scanner.nextLine();
     
     if (userRepo.authenticate(username, password)) {
         currentUser = userRepo.findByUsername(username);
         System.out.println("✅ Login successful! Welcome " + currentUser.getUsername());
         
         if (currentUser.getRole().equals("ADMIN")) {
             showAdminMenu();
         } else {
             showPassengerMenu();
         }
     } else {
         System.out.println("❌ Invalid username or password!");
     }
 }
 
 private static void registerPassenger() {
     System.out.println("\n=== PASSENGER REGISTRATION ===");
     System.out.print("Username: ");
     String username = scanner.nextLine();
     System.out.print("Password: ");
     String password = scanner.nextLine();
     System.out.print("Email: ");
     String email = scanner.nextLine();
     System.out.print("Full Name: ");
     String fullName = scanner.nextLine();
     System.out.print("Phone Number: ");
     String phone = scanner.nextLine();
     
     if (userRepo.addUser(new Passenger(username, password, email, fullName, phone))) {
         System.out.println("✅ Registration successful! You can now login.");
     } else {
         System.out.println("❌ Username already exists!");
     }
 }
 
 private static void showPassengerMenu() {
     while (currentUser != null) {
         System.out.println("\n=== PASSENGER MENU ===");
         System.out.println("1. Check Ticket Availability");
         System.out.println("2. View Ticket List");
         System.out.println("3. Book Ticket");
         System.out.println("4. Cancel Ticket");
         System.out.println("5. Logout");
         System.out.print("Choose option: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine();
         
         switch (choice) {
             case 1:
                 checkTicketAvailability();
                 break;
             case 2:
                 viewTicketList();
                 break;
             case 3:
                 bookTicket();
                 break;
             case 4:
                 cancelTicket();
                 break;
             case 5:
                 currentUser = null;
                 System.out.println("Logged out successfully!");
                 return;
             default:
                 System.out.println("Invalid option!");
         }
     }
 }
 
 private static void showAdminMenu() {
     while (currentUser != null) {
         System.out.println("\n=== ADMIN MENU ===");
         System.out.println("1. View All Tickets");
         System.out.println("2. Process Refund");
         System.out.println("3. View System Statistics");
         System.out.println("4. Logout");
         System.out.print("Choose option: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine();
         
         switch (choice) {
             case 1:
                 viewAllTickets();
                 break;
             case 2:
                 processRefund();
                 break;
             case 3:
                 viewStatistics();
                 break;
             case 4:
                 currentUser = null;
                 System.out.println("Admin logged out successfully!");
                 return;
             default:
                 System.out.println("Invalid option!");
         }
     }
 }
 
 private static void checkTicketAvailability() {
     System.out.println("\n=== TICKET AVAILABILITY ===");
     System.out.print("Enter source station: ");
     String source = scanner.nextLine();
     System.out.print("Enter destination station: ");
     String destination = scanner.nextLine();
     
     List<Ticket> availableTickets = ticketRepo.getAvailableTickets(source, destination);
     
     if (availableTickets.isEmpty()) {
         System.out.println("❌ No tickets available for this route.");
     } else {
         System.out.println("✅ Available Tickets:");
         for (int i = 0; i < availableTickets.size(); i++) {
             System.out.println((i + 1) + ". " + availableTickets.get(i));
         }
     }
 }
 
 private static void viewTicketList() {
     System.out.println("\n=== YOUR TICKETS ===");
     List<Ticket> userTickets = ticketRepo.getTicketsByUser(currentUser.getUsername());
     
     if (userTickets.isEmpty()) {
         System.out.println("No tickets booked yet.");
     } else {
         for (Ticket ticket : userTickets) {
             System.out.println(ticket);
         }
     }
 }
 
 private static void bookTicket() {
     System.out.println("\n=== BOOK TICKET ===");
     System.out.print("Enter source station: ");
     String source = scanner.nextLine();
     System.out.print("Enter destination station: ");
     String destination = scanner.nextLine();
     System.out.print("Enter journey date (yyyy-mm-dd): ");
     String dateStr = scanner.nextLine();
     System.out.print("Enter fare amount: ");
     double fare = scanner.nextDouble();
     scanner.nextLine();
     
     // Create and book ticket
     Ticket ticket = new Ticket(currentUser.getUsername(), source, destination, dateStr, fare);
     
     if (ticketRepo.addTicket(ticket)) {
         System.out.println("✅ Ticket booked successfully!");
         System.out.println("Your Ticket: " + ticket);
         
         // Process payment
         processPayment(ticket);
     } else {
         System.out.println("❌ Failed to book ticket!");
     }
 }
 
 private static void processPayment(Ticket ticket) {
     System.out.println("\n=== PAYMENT ===");
     System.out.println("Amount to pay: $" + ticket.getFare());
     System.out.print("Confirm payment? (yes/no): ");
     String confirm = scanner.nextLine();
     
     if (confirm.equalsIgnoreCase("yes")) {
         ticket.setStatus("BOOKED");
         System.out.println("✅ Payment successful! Ticket is now confirmed.");
     } else {
         ticket.setStatus("CANCELLED");
         System.out.println("❌ Payment cancelled. Ticket booking failed.");
     }
 }
 
 private static void cancelTicket() {
     System.out.println("\n=== CANCEL TICKET ===");
     viewTicketList();
     
     System.out.print("Enter Ticket ID to cancel: ");
     String ticketId = scanner.nextLine();
     
     Ticket ticket = ticketRepo.findTicketById(ticketId);
     
     if (ticket == null || !ticket.getPassengerUsername().equals(currentUser.getUsername())) {
         System.out.println("❌ Ticket not found or you don't have permission to cancel this ticket.");
         return;
     }
     
     if (ticket.getStatus().equals("CANCELLED")) {
         System.out.println("❌ Ticket is already cancelled.");
         return;
     }
     
     ticket.setStatus("CANCELLED");
     System.out.println("✅ Ticket cancelled successfully!");
     
     // Process refund
     processRefund(ticket);
 }
 
 private static void processRefund(Ticket ticket) {
     System.out.println("\n=== REFUND PROCESS ===");
     double refundAmount = ticket.getFare() * 0.8; // 80% refund
     System.out.println("Refund amount: $" + refundAmount + " (80% of original fare)");
     System.out.println("✅ Refund processed successfully! Money will be credited within 3-5 business days.");
 }
 
 private static void viewAllTickets() {
     System.out.println("\n=== ALL TICKETS ===");
     List<Ticket> allTickets = ticketRepo.getAllTickets();
     
     if (allTickets.isEmpty()) {
         System.out.println("No tickets in the system.");
     } else {
         for (Ticket ticket : allTickets) {
             System.out.println(ticket);
         }
     }
 }
 
 private static void processRefund() {
     System.out.println("\n=== ADMIN REFUND PROCESSING ===");
     System.out.print("Enter Ticket ID for refund: ");
     String ticketId = scanner.nextLine();
     
     Ticket ticket = ticketRepo.findTicketById(ticketId);
     
     if (ticket == null) {
         System.out.println("❌ Ticket not found.");
         return;
     }
     
     if (!ticket.getStatus().equals("CANCELLED")) {
         System.out.println("❌ Ticket is not cancelled. Cannot process refund.");
         return;
     }
     
     System.out.println("Processing refund for: " + ticket);
     System.out.println("✅ Refund marked as completed by admin.");
 }
 
 private static void viewStatistics() {
     System.out.println("\n=== SYSTEM STATISTICS ===");
     List<Ticket> allTickets = ticketRepo.getAllTickets();
     
     int totalTickets = allTickets.size();
     int bookedTickets = 0;
     int cancelledTickets = 0;
     double totalRevenue = 0;
     
     for (Ticket ticket : allTickets) {
         if (ticket.getStatus().equals("BOOKED")) {
             bookedTickets++;
             totalRevenue += ticket.getFare();
         } else if (ticket.getStatus().equals("CANCELLED")) {
             cancelledTickets++;
         }
     }
     
     System.out.println("Total Tickets: " + totalTickets);
     System.out.println("Booked Tickets: " + bookedTickets);
     System.out.println("Cancelled Tickets: " + cancelledTickets);
     System.out.println("Total Revenue: $" + totalRevenue);
 }
}