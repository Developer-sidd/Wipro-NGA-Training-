

/*Task 4: Arrays - Declaration, Initialization, and Usage
Create a program that declares an array of integers, initializes it with
consecutive numbers, and prints the array in reverse order.
 */

public class ProgramAssignment4 {

    public static void main(String[] args) {

        System.out.println("The elements of the array before reversing are -");
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();

        System.out.println("The elements of the array in the reverse order is - ");
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(" " + arr[i] + " ");
        }

    }

}