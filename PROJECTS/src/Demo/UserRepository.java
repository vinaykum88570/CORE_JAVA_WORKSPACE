package Demo;

import java.util.HashMap;
import java.util.Map;

//User Repository
class UserRepository {
 private Map<String, User> users;

 
 public UserRepository() {
     this.users = new HashMap<>();
     initializeSampleData();
 }
 
 private void initializeSampleData() {
     // Sample passengers
     users.put("john", new Passenger("john", "pass123", "john@email.com", "John Doe", "1234567890"));
     users.put("alice", new Passenger("alice", "pass456", "alice@email.com", "Alice Smith", "0987654321"));
     
     // Sample admin
     users.put("admin", new Admin("admin", "admin123", "admin@system.com", "ADM001"));
 }
 
 public User findByUsername(String username) {
     return users.get(username);
 }
 
 public boolean addUser(User user) {
     if (users.containsKey(user.getUsername())) {
         return false;
     }
     users.put(user.getUsername(), user);
     return true;
 }
 
 public boolean authenticate(String username, String password) {
     User user = users.get(username);
     return user != null && user.getPassword().equals(password);
 }
}
