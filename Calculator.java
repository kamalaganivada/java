import java.util.Scanner;

public class Calculator {
    
    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;  // Return Not-a-Number if division by zero
        }
        return a / b;
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the simple calculator!");

        // Loop for continuous operation
        while (true) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            System.out.println("Result: " + result);

            // Prompt to continue or exit
            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String continueCalc = scanner.next();
            if (!continueCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}