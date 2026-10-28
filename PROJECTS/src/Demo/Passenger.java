package Demo;

//Passenger class
class Passenger extends User {
 private String fullName;
 private String phoneNumber;
 
 public Passenger(String username, String password, String email, 
                 String fullName, String phoneNumber) {
     super(username, password, email);
     this.fullName = fullName;
     this.phoneNumber = phoneNumber;
 }
 
 public String getFullName() { return fullName; }
 public String getPhoneNumber() { return phoneNumber; }
 
 @Override
 public String getRole() {
     return "PASSENGER";
 }
}