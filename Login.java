public class Login {
    private String username;
    private String password;
    // Getters and setters for username and password
    
    // Method to validate the login credentials
    public boolean validateCredentials() {
        // Replace the hardcoded username and password with your actual database credentials
        String hardcodedUsername = "admin";
        String hardcodedPassword = "password";
        
        // Compare the provided username and password with the hardcoded ones
        return username.equals(hardcodedUsername) && password.equals(hardcodedPassword);



    }

    

}
