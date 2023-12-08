import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        printNum(n);
        in.close();
    }
    public static void printNum(int n){
        for(int i=1; i<n; i++){
            System.out.print(i + " ");
        }
        System.out.print(n);    
    }
}