import java.util.Scanner;

public class MinimizeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] % 2 != 0) {
                break;
            }
            while (arr[i] % 2 == 0) {
                count++;
                arr[i] /= 2;
            }
            if (i==0 || count < res ) {
                res = count;
            }
        }
        System.out.println(res);
        in.close();
    }
}
