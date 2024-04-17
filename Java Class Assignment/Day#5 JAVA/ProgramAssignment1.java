public class ProgramAssignment1 {

    public static void main(String[] args) {
        // Task 1: Data Types/Variables
        // Write a program that declares two integer variables,
        // swaps their values without using a third variable, and prints the result.
        int a = 5, b = 10;

        System.out.println("Before Swapping");
        System.out.println("a =" + a);
        System.out.println("b =" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping");
        System.out.println("a =" + a);
        System.out.println("b =" + b);

    }
}