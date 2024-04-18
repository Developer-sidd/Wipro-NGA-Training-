import java.util.Scanner;
//checking health insurencs
public class HealthInsurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age ?");
        int age = sc.nextInt();
        if(age >= 18 && age <= 65){
            System.out.println("Do you have pre-existing medical condition ? (yes/no)");
            String condition = sc.next();
            if(condition.equals("no")){
                System.out.println("Did you hospitalized during last 6 months ? (yes/no)");
                String hosp = sc.next();
                if(hosp.equals("no")){
                    System.out.println("You are eligible for health insurance");
                }
                else{
                    System.out.println("You are not eligible for health insurance");
                }
            }
            else{
                System.out.println("You are not eligible for health insurance");
            }
        }
        else{
            System.out.println("You are not eligible for health insurance");
        }
    }
}