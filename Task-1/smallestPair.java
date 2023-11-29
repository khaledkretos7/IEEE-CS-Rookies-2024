import java.util.Scanner;

public class smallestPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int x = 0; x < t; x++) {
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i <array.length; i++) {
                array[i] =in.nextInt();
            }
    int smallest = array[0] + array[1] + 2 - 1;
    for(int i = 1; i<=n-1 ; i++ ){
        for (int j = i + 1; j <= n; j++) {
            if (array[i - 1] + array[j - 1] + j - i < smallest) {
                smallest = array[i - 1] + array[j - 1] + j - i;
            }
        }
     }
     System.out.println(smallest);
}
in.close();
    }
}
