package classprograms;


public class JavaLoops {

    /*
     * Write a program to display all even no
     * using for looop  Also display odd no
     * using while loop
     */

    public static void main(String[] args) {
        System.out.println("Even Number are -");
        for (int i=0;i<10;i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
        int j=0;
        System.out.println("Odd numbers are -");
        while(j<=10) {
            if(j%2==1)
                System.out.println(j);
        }j++;


    }

}