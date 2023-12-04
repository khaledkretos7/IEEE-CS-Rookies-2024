import java.util.Scanner;

public class maxSubsequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int a = 1;
        for (int i = 0; i < n-1; i++) {
            if(str.charAt(i) !=str.charAt(i+1))
            a++;
        }
        System.out.println(a);
        in.close();
    }
}
