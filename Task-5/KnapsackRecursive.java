import java.util.Scanner;

public class KnapsackRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int W = in.nextInt();

        int[] weights = new int[N];
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }

        int maxSum = knapsack(weights, values, W, N);
        System.out.println(maxSum);
        in.close();
    }
    

    private static int knapsack(int[] weights, int[] values, int capacity, int n) {
        // Base case:
        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weights[n - 1] > capacity) {
            return knapsack(weights, values, capacity, n - 1);
        }
        int included = values[n - 1] + knapsack(weights, values, capacity - weights[n - 1], n - 1);
        int excluded = knapsack(weights, values, capacity, n - 1);
        return Math.max(included, excluded);
    }
}