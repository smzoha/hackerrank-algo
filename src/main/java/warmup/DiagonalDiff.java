package warmup;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class DiagonalDiff {

    private static int diagonalDifference(int[][] a) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int index = 0; index < a[0].length; index++) {
            leftDiagonalSum += a[index][index];
            rightDiagonalSum += a[index][a[0].length - index - 1];
        }

        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
