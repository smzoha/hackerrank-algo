package implementations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/9/2018
 */
public class BonAppetit {

    private static String bonAppetit(int k, int b, int[] ar) {
        List<Integer> pricesList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        pricesList.remove(k);

        int actualSum = pricesList.stream().mapToInt(Integer::intValue).sum();

        if (b > (actualSum / 2)) {
            return Integer.toString(b - (actualSum / 2));
        } else {
            return "Bon Appetite";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        String result = bonAppetit(k, b, ar);
        System.out.println(result);
    }
}
