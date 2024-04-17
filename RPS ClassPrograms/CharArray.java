
public class CharArray {

    public static void main(String[] args) {
        char [] arr={'s','i','d','d','r','a','m',};
        //Create a character array and display total number of vowels
        int count=0;

        for(int i=0;i<=5;i++) {
            if(arr[i]=='a'||arr[i]=='i'||arr[i]=='e'||arr[i]=='o'||arr[i]=='u') {
                count++;
            }
        }
        System.out.println("The total number of vowels in the character array is - "+count);



    }

}