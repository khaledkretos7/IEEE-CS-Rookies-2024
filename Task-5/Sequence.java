import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(sequenceLength(N));
        in.close();
    }

    public static int sequenceLength(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return 1 + sequenceLength(n / 2);
        } else {
            return 1 + sequenceLength(3 * n + 1);
        }
    }
}