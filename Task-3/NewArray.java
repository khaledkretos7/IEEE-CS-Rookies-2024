import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            arr2[i] = in.nextInt();
        print(arr1, arr2);
        in.close();
    }

    public static void print(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
    }
}
