package algorithm.implementations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author smzoha
 * @since 4/28/18
 */
public class EqualizeArr {

    private static int equalizeArray(int[] arr) {
        List<Integer> elems = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> distinctElems = elems.stream().distinct().collect(Collectors.toList());

        int maxFreq = Integer.MIN_VALUE;

        for (Integer elem : distinctElems) {
            maxFreq = Math.max(Collections.frequency(elems, elem), maxFreq);
        }

        return arr.length - maxFreq;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}