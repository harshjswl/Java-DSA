public class GetSecondSmallest {
    public static void main(String[] args) {
        int[] arr={20,10,30,40,50,60,5};
        int firstMin=arr[0];
        int secondMin=arr[1];
        if(arr[0]<arr[1]){
            firstMin=arr[0];
            secondMin=arr[1];
        }else{
            secondMin=arr[0];
            firstMin=arr[1];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]<firstMin){
                secondMin=firstMin;
                firstMin=arr[i];
            } else if (arr[i]<secondMin) {
                secondMin=arr[i];
            }
        }
        System.out.println(firstMin);
        System.out.println(secondMin);
    }
}
