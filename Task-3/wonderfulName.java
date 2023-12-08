import java.util.Scanner;

public class wonderfulName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isOdd(n) && isPalndrome(n))
            System.out.println("YES");
        else
            System.out.println("NO");
        in.close();
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isPalndrome(int n) {
        String string = "";
        while (n != 0) {
            string += n % 2;
            n /= 2;
        }
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
}