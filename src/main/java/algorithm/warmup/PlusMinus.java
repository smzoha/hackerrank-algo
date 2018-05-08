package algorithm.warmup;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class PlusMinus {

    private static void plusMinus(int[] arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (int anArr : arr) {
            if (anArr == 0) {
                zeroCount++;
            } else if (anArr > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println(String.format("%.6f", positiveCount != 0 ? positiveCount / arr.length : 0));
        System.out.println(String.format("%.6f", negativeCount != 0 ? negativeCount / arr.length : 0));
        System.out.println(String.format("%.6f", zeroCount != 0 ? zeroCount / arr.length : 0));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
