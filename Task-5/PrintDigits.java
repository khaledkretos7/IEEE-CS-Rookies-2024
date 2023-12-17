import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            printDigits(n);
            System.out.println();
        }
        in.close();
    }

    private static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigits(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}