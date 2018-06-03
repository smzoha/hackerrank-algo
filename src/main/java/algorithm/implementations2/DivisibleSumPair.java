package algorithm.implementations2;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 5/22/2018
 */
public class DivisibleSumPair {

    private static final Scanner scanner = new Scanner(System.in);

    private static int divisibleSumPairs(int n, int k, int[] ar) {
        int counter = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);

        scanner.close();
    }
}
