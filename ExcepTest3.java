public class ExcepTest3 {
    public static void main(String[] args) {
        // Initialize a String variable with null
        String str = null;

        try {
            // Attempt to access its length to deliberately cause a NullPointerException
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            // Handle the exception in the catch block
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } finally {
            // Assign a valid value to the String and print it
            str = "Assigned a valid value in finally block!";
            System.out.println("String after finally block: " + str);
        }
    }
}
