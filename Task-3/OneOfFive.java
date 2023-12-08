import java.util.Scanner;

public class OneOfFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int min = 0;
        int prime = 0;
        int palindrome = 0;
        int[] arr = new int[n];
        int maxdiv = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(arr[i], arr[i + 1]);
            min = Math.min(arr[i], arr[i + 1]);

        }
        for (int i = 0; i < n; i++) {
            if (prime(arr[i])) {
                prime += 1;
            }
            if (isPalndrome(arr[i])) {
                palindrome += 1;
            }
            if (divisors(arr[i]) >= maxdiv) {
                maxdiv += arr[i];
            }
        }
        System.out.println("The maximum number : " + max);
        System.out.println("The minimum number : " + min);
        System.out.println("The number of prime numbers : " + prime);
        System.out.println("The number of palindrome numbers : " + palindrome);
        System.out.println("The number that has the maximum number of divisors : " + maxdiv);
        in.close();
    }

    public static int divisors(int num) {
        int div = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div += 1;
            }
        }
        return div;
    }

    public static boolean isPalndrome(int number) {
        int rem = 0;
        int temp = number;
        int rev = 0;
        while (temp != 0) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }
        if (rev == number) {
            return true;
        }
        return false;
    }

    public static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
