import java.util.Scanner;

public class MinimizeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int res =0;
        for (int i = 0; i <  n; i++) {
            int  counter =0;
            if(arr[i] %2 !=0){
                System.out.println("0");
                return;
            }
            while (arr[i] %2 ==0){
                counter ++;
                arr[i] /= 2;
            }
            if(i == 0 || counter < res ){
                res = counter ;
            }
        }
        System.out.println(res);
        in.close();
    }
}
