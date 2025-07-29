public class SearchElement {
    public static void main(String[] args) {
        int[] arr={20,30,40,59,12,45,100};
        int element=100;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                System.out.println("We have "+element+" in the array at position "+i);
            }
        }
    }
}
