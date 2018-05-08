package algorithm.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 1/14/18
 */
public class BirthdayCakeCandles {

    private static int birthdayCakeCandles(int[] ar) {
        List<Integer> arList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        return Collections.frequency(arList, Collections.max(arList));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
    }
}