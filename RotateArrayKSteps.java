public class RotateArrayKSteps {
    public static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static  void reverse(int[]arr,int start,int end){
        while (start<end){
            int tem =arr[start];
            arr[start]=arr[end];
            arr[end]=tem;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
      int[] arr={10,20,30,40,50,60};
      int k = 3;
      rotateArray(arr,k);
      System.out.println("Rotated Array: "+ Arrays.toString(arr));
    }
}
