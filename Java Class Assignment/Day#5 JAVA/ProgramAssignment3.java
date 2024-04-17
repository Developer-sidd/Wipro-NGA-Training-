import java.util.Scanner;

public class ProgramAssignment3 {
    /*
     * Task 3: Control Flow Write a Java program that reads an integer and prints
     * whether it is a prime number using a for loop and if statements.
     */


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");

        int n =sc.nextInt();
        int count=0;

        if(n<=1) {
            System.out.println(n+" is not prime number");
        }
        else {
            for(int i=2;i<=n;i++) {
                if(n%i==0) {
                    count++;
                }
            }
        }
        if(count==1) {
            System.out.println(n+" is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }

    }

}