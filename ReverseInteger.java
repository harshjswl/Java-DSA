public class ReverseInteger {
    public static void main(String[] args) {
        int num =revrese(2033);
        System.out.println(num);
    }
    public static int revrese(int x){
        int reverse =0;
        while(x>0);{
            int digit=x%10;
            reverse=(reverse*10)+digit;
            x=x/10;
        }
        return reverse;
    }
}
