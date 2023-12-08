import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int times=in.nextInt();
        int[]arr=new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        shiftRight(arr, n, times);
        in.close();
    }
    public static void shiftRight(int[]arr, int n , int times) {
        int shift=times % n;
        for (int i=n-shift; i<arr.length; i++){
            System.out.printf(arr[i]+" ");
        }
        for (int i=0; i<arr.length-shift; i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
