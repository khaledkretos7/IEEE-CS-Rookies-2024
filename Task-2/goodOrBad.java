import java.util.Scanner;

public class goodOrBad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        while (n >= 0) {
            String s1 = in.next();
            if (s1.contains("010") || s1.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
            n--;
        }
        in.close();
    }
}