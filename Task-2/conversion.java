import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',')
                System.out.print(" ");
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                System.out.printf("%c", (char) str.charAt(i) - 32);
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                System.out.printf("%c", (char) str.charAt(i) + 32);
        }
        in.close();
    }
}
