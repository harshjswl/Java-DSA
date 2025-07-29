public class Max_Min {
    public static void main(String[] args) {
        int[] arr={50,40,30,60,40,100};
        int max=arr[0];
        int min=arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]<max){
              max=arr[i];
          } else if (min<arr[i]) {
              min=arr[i];
          }
      }
        System.out.println("The Max value in array : "+max);
        System.out.println("The Min value in array : "+min);
    }
}
