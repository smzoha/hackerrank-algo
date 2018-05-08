package algorithm.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class MiniMaxSum {

    private static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long maxSum = 0;
        long minSum = 0;

        for (int index = 0; index < 4; index++) {
            minSum += arr[index];
        }

        for (int index = 4; index > 0; index--) {
            maxSum += arr[index];
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
