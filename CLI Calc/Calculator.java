import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Logarithmic");
            System.out.println("6. Exponential");
            System.out.println("7. Modulus");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            if (choice == 8) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            double result;

            switch (choice) {
                case 1:
                    result = add();
                    break;
                case 2:
                    result = subtract();
                    break;
                case 3:
                    result = multiply();
                    break;
                case 4:
                    result = divide();
                    break;
                case 5:
                    result = logarithmic();
                    break;
                case 6:
                    result = exponential();
                    break;
                case 7:
                    result = modulus();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        s.close();
    }

    private static double add() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        return num1 + num2;
    }

    private static double subtract() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        return num1 - num2;
    }

    private static double multiply() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        return num1 * num2;
    }

    private static double divide() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = s.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = s.nextDouble();
        if (denominator != 0) {
            return numerator / denominator;
        } else {
            System.out.println("Cannot divide by zero. Returning 0.");
            return 0;
        }
    }

    private static double logarithmic() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = s.nextDouble();
        System.out.print("Enter number: ");
        double num = s.nextDouble();
        return Math.log(num) / Math.log(base);
    }

    private static double exponential() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = s.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = s.nextDouble();
        return Math.pow(base, exponent);
    }

    private static double modulus() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = s.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = s.nextDouble();
        return dividend % divisor;
    }
}
