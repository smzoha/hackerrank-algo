package dynamic;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/18/2018
 */
public class CountingCoins {

    private static long getCombinations(int n, int[] c){
        long[] combination = new long[n + 1];
        combination[0] = 1;

        for (int coin : c) {
            for (int i = coin; i < combination.length; i++) {
                combination[i] += combination[i - coin];
            }
        }

        return combination[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }

        long ways = getCombinations(n, c);
        System.out.println(ways);
    }
}
