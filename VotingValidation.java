// User-defined exception class
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class VotingValidation {
    // Method to validate age for voting
    public static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            // Throw user-defined exception if age is less than 18
            throw new AgeNotValidException("Age is not valid for voting! Must be 18 or older.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        int age = 16; // Example age to validate
        try {
            // Validate age
            validateAge(age);
        } catch (AgeNotValidException e) {
            // Handle the user-defined exception
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
