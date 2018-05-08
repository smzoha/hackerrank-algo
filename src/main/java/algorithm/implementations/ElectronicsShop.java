package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class ElectronicsShop {

    private static long getMoneySpent(long[] keyboards, long[] drives, long s){
        long result = -1, sum;

        for (long keyboard : keyboards) {
            for (long drive : drives) {
                sum = keyboard + drive;
                if (sum <= s) result = Math.max(sum, result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        long[] keyboards = new long[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextLong();
        }
        long[] drives = new long[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextLong();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        long moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
