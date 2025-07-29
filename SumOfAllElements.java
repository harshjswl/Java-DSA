public class SumOfAllElements {
    public static void main(String[] args) {
        int[] arr={30,40,50,60,10,20};
//        int first=arr[0];
//        for(int i=1;i<arr.length;i++){
//            first=first+arr[i];
//        }
//        System.out.println(first);

        int sum =0;
        for(int i=0;i< arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
