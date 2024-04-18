import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your credit score ?");
        int cScore = sc.nextInt();
        if(cScore > 700){
            System.out.println("What is your debt score ?");
            int debt = sc.nextInt();
            System.out.println("What is your income ?");
            int income = sc.nextInt();
            System.out.println("What is your bankruptcies status ?");
            int bStatus = sc.nextInt();
            float dti = ((float) debt /income)*100;
            System.out.println(dti);
            if(dti > 30 && bStatus >= 5){
                System.out.println("You are eligible for credit card");
            }
            else{
                System.out.println("You are not eligible for credit card");
            }
        }
        else{
            System.out.println("NO, You are not eligible for credit card");
        }
    }
}