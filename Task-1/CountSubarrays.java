import java.util.Scanner;

public class CountSubarrays {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int c = 0;
        while (x-- != 0) {
            int y = in.nextInt();
            int arr[] = new int[y];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                c++;
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                max = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (max < arr[j]) {
                        c++;
                        max = arr[j];
                    } else {
                        break;
                    }
                }
            }
            System.out.println(c);
            c=0;
        }
        in.close();
    }
}
