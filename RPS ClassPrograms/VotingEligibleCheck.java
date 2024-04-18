import java.util.Scanner;

public class VotingEligibleCheck {

    public static void main(String[] args) {

        //Enter Age
        System.out.println(" Please enter Your Age Below : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println(" you are not eligible to Vote");

        } else {
            System.out.println(" Your Are Eligible to Vote😊");

        }
    }
}

