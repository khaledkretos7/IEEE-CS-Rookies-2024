import java.util.Scanner;

public class newString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(s1.length() + " " + s2.length());
        System.out.println(s1 + " " + s2);
        
        in.close();
    }
}