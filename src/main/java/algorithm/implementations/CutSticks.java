package algorithm.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/17/2018
 */
public class CutSticks {

    private static int[] cutTheSticks(int[] arr) {
        List<Integer> cutCount = new ArrayList<>();

        while (!isArrayEmpty(arr)) {
            int minValue = Arrays.stream(arr).boxed()
                    .filter(i -> i > 0)
                    .min(Integer::compareTo)
                    .orElse(0);

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] -= minValue;
                    count++;
                }
            }

            cutCount.add(count);
        }

        return cutCount.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isArrayEmpty(int[] arr) {
        return Arrays.stream(arr).boxed().filter(i -> i == 0).count() == arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}