import java.util.Scanner;

public class ReachValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            if (canReachN(1, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }

    private static boolean canReachN(long value, long target) {
        if (value == target) {
            return true;
        }
        if (value > target) {
            return false;
        }
        return canReachN(value * 10, target) || canReachN(value * 20, target);
    }
}