package Demo;

//Ticket class
class Ticket {
 private String ticketId;
 private String passengerUsername;
 private String source;
 private String destination;
 private String journeyDate;
 private double fare;
 private String status;
 
 public Ticket(String passengerUsername, String source, String destination, 
               String journeyDate, double fare) {
     this.ticketId = generateTicketId();
     this.passengerUsername = passengerUsername;
     this.source = source;
     this.destination = destination;
     this.journeyDate = journeyDate;
     this.fare = fare;
     this.status = "AVAILABLE";
 }
 
 private String generateTicketId() {
     return "TKT" + System.currentTimeMillis() % 10000;
 }
 
 // Getters
 public String getTicketId() { return ticketId; }
 public String getPassengerUsername() { return passengerUsername; }
 public String getSource() { return source; }
 public String getDestination() { return destination; }
 public String getJourneyDate() { return journeyDate; }
 public double getFare() { return fare; }
 public String getStatus() { return status; }
 
 // Setters
 public void setStatus(String status) { this.status = status; }
 
 @Override
 public String toString() {
     return String.format("Ticket[ID:%s, From:%s, To:%s, Date:%s, Fare:$%.2f, Status:%s, Passenger:%s]",
             ticketId, source, destination, journeyDate, fare, status, passengerUsername);
 }
}
