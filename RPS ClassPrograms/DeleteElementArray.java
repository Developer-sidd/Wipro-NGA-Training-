import java.util.Scanner;

public class DeleteElementArray {

    public static void main(String[] args) {
        /*
         *Create a program to store the 5 number in an array and accept a no from user to be deleted.
         *Update the value of remaining element
         * with 20%
         */
        Scanner sc = new Scanner(System.in);
        float[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter the number to be deleted");
        float del = sc.nextFloat();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (del == arr[i]) {
                arr[i] = 0;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element to be deleted not found in the array");
        } else {
            System.out.println("The updated elements after increasing by 20% are:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + arr[i] * 20 / 100;
                System.out.print(arr[i] + " ");
            }
        }
    }
}
