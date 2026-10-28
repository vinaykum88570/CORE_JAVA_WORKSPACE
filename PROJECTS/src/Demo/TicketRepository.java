package Demo;

import java.util.ArrayList;
import java.util.List;

//Ticket Repository
class TicketRepository {
 private List<Ticket> tickets;
 
 public TicketRepository() {
     this.tickets = new ArrayList<>();
     initializeSampleTickets();
 }
 
 private void initializeSampleTickets() {
     tickets.add(new Ticket("", "New York", "Boston", "2025-01-15", 50.0));
     tickets.add(new Ticket("", "Chicago", "Los Angeles", "2025-01-20", 150.0));
     tickets.add(new Ticket("", "Miami", "Orlando", "2025-01-25", 30.0));
     tickets.add(new Ticket("john", "Seattle", "Portland", "2025-01-18", 40.0));
 }
 
 public boolean addTicket(Ticket ticket) {
     return tickets.add(ticket);
 }
 
 public List<Ticket> getAvailableTickets(String source, String destination) {
     List<Ticket> available = new ArrayList<>();
     for (Ticket ticket : tickets) {
         if (ticket.getSource().equalsIgnoreCase(source) && 
             ticket.getDestination().equalsIgnoreCase(destination) &&
             ticket.getStatus().equals("AVAILABLE")) {
             available.add(ticket);
         }
     }
     return available;
 }
 
 public List<Ticket> getTicketsByUser(String username) {
     List<Ticket> userTickets = new ArrayList<>();
     for (Ticket ticket : tickets) {
         if (ticket.getPassengerUsername().equals(username)) {
             userTickets.add(ticket);
         }
     }
     return userTickets;
 }
 
 public List<Ticket> getAllTickets() {
     return new ArrayList<>(tickets);
 }
 
 public Ticket findTicketById(String ticketId) {
     for (Ticket ticket : tickets) {
         if (ticket.getTicketId().equals(ticketId)) {
             return ticket;
         }
     }
     return null;
 }
}