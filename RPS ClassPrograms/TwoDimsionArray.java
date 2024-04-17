import java.util.Scanner;

public class TwoDimsionArray {
    // Store the number in 2d array of 4x5 and display sum of array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int[][] arr = new int[4][5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];

            }

        }
        System.out.print(" The Sum of the elements of the 2D array is - " + sum);

    }

}