public class Division{
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // Intentionally set to zero to trigger the exception
        int result;

        try {
            result = numerator / denominator; // Attempting division
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Division operation attempt is complete.");
        }
    }
}