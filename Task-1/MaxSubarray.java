import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int x = 0; x < t; x++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
                int max = a[i];
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > max) {
                        max = a[j];
                    }
                    System.out.print(max + " ");
                }
            }
            System.out.println("");
        }
        in.close();
    }
}
