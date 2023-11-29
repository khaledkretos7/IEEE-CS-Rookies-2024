import java.util.Scanner;

public class checkCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String S = in.next();
        boolean p = check(a, b, S);
        if (p) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        in.close();
    }
    public static boolean check(int a, int b, String S) {
        if (S.length() != a + b + 1) {
            return false;
        }
        if (S.charAt(a) != '-') {
            return false;
        }
        for (int i = 0; i < a + b + 1; i++) {
            if (S.charAt(i) == '-' & i != a) {
                return false;
            }
        }
        return true;
    }
}
