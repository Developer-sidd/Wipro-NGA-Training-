import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Type of operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Division\n" +
                "4. Multiplication\n");
        int res = sc.nextInt();
        switch (res) {
            case 1:
                int add = a + b;
                System.out.println("Result: " + add);
                break;
            case 2:
                int sub = a - b;
                System.out.println("Result: " + sub);
                break;
            case 3:
                if (b != 0) {
                    int div = a / b;
                    System.out.println("Result: " + div);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 4:
                int mul = a * b;
                System.out.println("Result: " + mul);
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
