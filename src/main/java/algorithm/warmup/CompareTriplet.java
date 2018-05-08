package algorithm.warmup;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class CompareTriplet {
    private static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result = new int[2];

        if (a0 != b0) result[score(a0, b0)]++;
        if (a1 != b1) result[score(a1, b1)]++;
        if (a2 != b2) result[score(a2, b2)]++;

        return result;
    }

    private static int score(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }
}
