import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void moveZero(int[] arr) {
        int size = arr.length;
        if (size == 0 || size == 1) {
            return;
        }

        int nz = 0, z = 0;
        while (nz < size) {
            if (arr[nz] != 0) {
                // Swap arr[nz] and arr[z]
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                z++;
            }
            nz++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 20, 0, 30, 0, 20, 0, 12, 0};
        moveZero(arr);
        System.out.println("After moving zeroes to the end: " + Arrays.toString(arr));
    }
}
