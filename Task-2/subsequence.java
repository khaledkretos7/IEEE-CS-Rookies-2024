import java.util.Scanner;
 
public class subsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = "hello";
        int b = 0;
        int a = 0;
        while (true) {
            if (a == str.length() || b == str2.length()) {
                break;
            }
            if (str.charAt(a) == str2.charAt(b)) {
                b++;
            }
            a++;
        }
        if (b == 5) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        in.close();
    }
}