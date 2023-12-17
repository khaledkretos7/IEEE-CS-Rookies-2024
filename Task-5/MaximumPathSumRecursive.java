import java.util.Scanner;

public class MaximumPathSumRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int maxSum = findMaxPathSum(matrix, 0, 0);
        System.out.println(maxSum);
        in.close();
    }

    private static int findMaxPathSum(int[][] matrix, int row, int col) {
        int N = matrix.length;
        int M = matrix[0].length;

        if (row == N - 1 && col == M - 1) {
            return matrix[row][col];
        }
        if (row == N - 1) {
            return matrix[row][col] + findMaxPathSum(matrix, row, col + 1);
        }
        if (col == M - 1) {
            return matrix[row][col] + findMaxPathSum(matrix, row + 1, col);
        }

        int downSum = matrix[row][col] + findMaxPathSum(matrix, row + 1, col);
        int rightSum = matrix[row][col] + findMaxPathSum(matrix, row, col + 1);
        return Math.max(downSum, rightSum);
    }
}