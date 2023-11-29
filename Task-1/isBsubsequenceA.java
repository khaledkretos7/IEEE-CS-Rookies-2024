import java.util.Scanner;

public class isBsubsequenceA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr1 = new long[n];
        long[] arr2 = new long[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextLong();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextLong();
        }
        int x=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[x]) {
                x++;
            }
        }
         if (x==m) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        in.close();
    }
}
