import java.util.Scanner;

public class ReplaceMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int j = 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                indexMin = j;
                ;
            }
            if (max < arr[j]) {
                max = arr[j];
                indexMax = j;
            }
        }
        arr[indexMax] = min;
        arr[indexMin] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        in.close();
    }
}
