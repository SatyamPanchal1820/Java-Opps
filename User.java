public class User {
    private String username;
    private String password;
    private String email;

    public void setUsername(String username) {
        if (username.length() >= 5) {
            this.username = username;
        } else {
            System.out.println("Username must be at least 5 characters long.");
        }
    }

    public void setPassword(String password) {
        if (password.length() >= 6 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*")) {
            this.password = password;
        } else {
            System.out.println("Password must contain at least one uppercase letter, one lowercase letter, and one digit.");
        }
    }


    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".com")) {
            this.email = email;
        } else {
            System.out.println("Email must be in a valid format (e.g., example@domain.com).");
        }
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("John");
        user.setPassword("password123");
        user.setEmail("john.doe@domain.com");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }
}

