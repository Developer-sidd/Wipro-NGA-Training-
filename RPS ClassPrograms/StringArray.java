
public class StringArray {

    public static void main(String[] args) {
        String[] arr = { "Archie", "James", "Alex", "Marc" };
        System.out.println("for each loop output - ");
        for (String i : arr) {
            System.out.println(i);

        }
        System.out.println();
        System.out.println("for loop output - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // Display the names character by character
        System.out.println();
        System.out.println("The names character by character are - ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                System.out.print(" " + arr[i].charAt(j) + " ");
            }
            System.out.println();
        }
    }

}