public class CountAllDigits {
    public static void main(String[] args) {
        int n = countDigits(8345);
        System.out.println("Total digits: " + n);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;  // Reduce the number
            count++;     // Increase digit count
        }
        return count;
    }
}
