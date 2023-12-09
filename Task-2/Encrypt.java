import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String Key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        int n = in.nextInt();
        String t =in.next();
        String O;
        String K;
        if (n == 1) {
            O = Original;
            K = Key;
        } else {
            K = Original;
            O = Key;
        }
        for (int j = 0; j < t.length(); j++) {
            for (int i = 0; i < O.length(); i++) {
                if (t.charAt(j) == O.charAt(i)) {
                    System.out.print(K.charAt(i));
                    break;
                }
            }
        }
        in.close();
    }

}