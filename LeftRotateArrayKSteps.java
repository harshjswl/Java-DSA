import java.util.Arrays;

public class LeftRotateArrayKSteps {
    public static void rotateLeft(int[]arr,int k){
        int n= arr.length-1;
        k=k%n;
        reverse(arr, 0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[]arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[]arr ={10,20,30,40,50,60};
        int k=2;
        rotateLeft(arr,k);
        System.out.println("Left Rotated Array: "+ Arrays.toString(arr));
    }
}
