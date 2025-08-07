public class ArrowTriangle {
    static void patterns(int n){
        for(int row=0;row<n*2;row++){
            int totalColsInRow=row>n?2*n-row:row;
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patterns(10);
    }
}
