package class23;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration user = new Registration();

        // Set valid email, userName, and password
        user.setEmail("Zzzzqqq@yahoo.com");
        user.setUserName("user098");
        user.setPassword("zaqwer");

        // Get and print user's information
        System.out.println("Email: " + user.getEmail());
        System.out.println("UserName: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());

        // Try to set invalid email, userName, and password
       /* user.setEmail("invalidemail@gmail.com");
        user.setUserName("short");
        user.setPassword("pwd");

        // Print user's information (should remain unchanged)
        System.out.println("Email: " + user.getEmail());
        System.out.println("UserName: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());*/
    }
}

