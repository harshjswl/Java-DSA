public class InvertedPyramid {
    public static void main(String[] args) {
        int  row =7;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(row-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
