public class ArrayAverage {

    public static void main(String[] args) {
        float [] arr={22,33,44,22,11,44,65};
        float x=average(arr);
        System.out.println("The Average of the array is - "+x);


    }

    public static float average(float[] arr) {
        float x=0;
        for(int i=0;i<arr.length;i++) {
            x+=arr[i];
        }
        x=x/arr.length;
        return x;

    }

}