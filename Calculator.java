public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division (with check)
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) a / b;
    }


    // Modulus
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulus by zero!");
        }
        return a % b;
    }

    // Square root
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number!");
        }
        return Math.sqrt(a);
    }

}
