public class PyramidStarPattern {
    public static void main(String[] args) {
        int start =7;
        for(int i=1;i<=start;i++){
            for(int j=1;j<=start-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
