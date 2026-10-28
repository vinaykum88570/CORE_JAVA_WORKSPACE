package Demo;


//Admin class
class Admin extends User {
 private String adminId;
 
 public Admin(String username, String password, String email, String adminId) {
     super(username, password, email);
     this.adminId = adminId;
 }
 
 public String getAdminId() { return adminId; }
 
 @Override
 public String getRole() {
     return "ADMIN";
 }
}
