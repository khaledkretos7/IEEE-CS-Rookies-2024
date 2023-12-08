import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(equation(x, n));
        in.close();
    }

    public static long equation(int x, int n) {
        long sum=0;
        if(x>=0&&n<=10){
        for (int i=1; i<=n; i++){
            if (i%2==0){ 
                sum+=Math.pow(x,i);
            }
            }}
        return sum; 
    }
}
