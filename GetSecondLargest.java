import java.util.Arrays;

public class GetSecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int firstLargest = arr[0];
        int secondLargest = arr[0];

        if(arr[0]>arr[1]){
            firstLargest=arr[0];
            secondLargest=arr[1];
        }else{
            firstLargest=arr[1];
            secondLargest=arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest=firstLargest;
                firstLargest = arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
