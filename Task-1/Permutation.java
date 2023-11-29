import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean status=false;
        int n = in.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int suma=0;
        int sumb=0;
        for (int i=0; i<n; i++){
            arr1[i]=in.nextInt();
            suma+=arr1[i];
        }
        for (int i=0; i<n; i++){
            arr2[i]=in.nextInt();
            sumb+=arr2[i];
        }
        if (suma==sumb) {
        for (int i = 0; i < arr2.length; i++) {
            status=false;
            for (int j = 0; j < arr2.length; j++) {
            if (arr1[i]==arr2[j]) {
            status=true;
            break;
            }
        }
        if (status==false) {
            break;
        }
    }
    }
    if (status) {
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    }
in.close(); 
}
}
