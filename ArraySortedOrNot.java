public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[]  arr={10,20,30,40,50,60};
        boolean isSorted=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}
