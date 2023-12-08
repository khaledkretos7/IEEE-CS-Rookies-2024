import java.util.Scanner;

public class primeFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (prime(num))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }

    public static boolean prime(int n) {
        if (n<=1)
        return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}