package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/16/2018
 */
public class SavePrisoner {

    private static int saveThePrisoner(int n, int m, int s) {
        return (m + s - 1) % n != 0 ? (m + s - 1) % n : n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
