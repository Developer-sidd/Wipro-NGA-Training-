public class ExceptionCode {



        public static void main (String[]args){
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[4]); // Trying to access index 4 which is out of bounds
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An ArrayIndexOutOfBoundsException occurred.");
            }
        }
    }
