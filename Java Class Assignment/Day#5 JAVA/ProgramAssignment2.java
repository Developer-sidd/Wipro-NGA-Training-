import java.util.Scanner;

public class ProgramAssignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        if (args.length == 2) {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
        } else {
            System.out.print("Enter first number: ");
            n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            n2 = sc.nextInt();
        }

        System.out.println("Entered numbers are: " + n1 + " and " + n2);
        System.out.println("Press A to perform addition operation");
        System.out.println("Press S to perform subtraction operation");
        System.out.println("Press M to perform multiplication operation");
        System.out.println("Press D to perform division operation");

        char c = sc.next().charAt(0);

        switch (c) {
            case 'A':
                int sum = n1 + n2;
                System.out.println("The addition of " + n1 + " and " + n2 + " is " + sum);
                break;
            case 'S':
                int sub = n1 - n2;
                System.out.println("The subtraction of " + n1 + " and " + n2 + " is " + sub);
                break;
            case 'M':
                int mul = n1 * n2;
                System.out.println("The multiplication of " + n1 + " and " + n2 + " is " + mul);
                break;
            case 'D':
                if (n2 != 0) {
                    float div = (float) n1 / n2;
                    System.out.println("The division of " + n1 + " and " + n2 + " is " + div);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
        sc.close();
    }
}
