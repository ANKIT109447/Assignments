class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    @SuppressWarnings("unused")
    double subtract(double a, double b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    @SuppressWarnings("unused")
    double multiply(double a, double b) {
        return a * b;
    }

    @SuppressWarnings("unused")
    int divide(int a, int b) {
        return a / b;
    }

    @SuppressWarnings("unused")
    double divide(double a, double b) {
        return a / b;
    }
}
public class calculatortest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Add (double): " + calc.add(5.2, 3.3));
        System.out.println("Subtract: " + calc.subtract(10, 4));
        System.out.println("Multiply: " + calc.multiply(6, 7));

}
}
