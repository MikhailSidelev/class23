package class23;

public class Registration {
    // Private instance variables
    private String email;
    private String userName;
    private String password;

    // Constructor
    public Registration() {
        // Constructor can be empty or contain initialization logic if needed
    }

    // Public method to set user's email with validation for Yahoo email
    public void setEmail(String email) {
        if (isValidYahooEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo email addresses are allowed.");
        }
    }

    // Public method to set user's userName with validation for length
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It should be at least 6 characters long.");
        }
    }

    // Public method to set user's password with validation for length
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It should be at least 6 characters long.");
        }
    }

    // Public method to get user's email
    public String getEmail() {
        return email;
    }

    // Public method to get user's userName
    public String getUserName() {
        return userName;
    }

    // Public method to get user's password
    public String getPassword() {
        return password;
    }

    // Private method to validate Yahoo email address
    private boolean isValidYahooEmail(String email) {
        return email.endsWith("@yahoo.com");
    }

    // Private method to validate length of userName and password
    private boolean isValidUserName(String userName) {
        return userName.length() >= 6;
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 6;
    }
}
