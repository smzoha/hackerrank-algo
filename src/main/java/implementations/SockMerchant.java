package implementations;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class SockMerchant {
    private static int sockMerchant(int n, int[] ar) {
        List<Integer> sockList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Set<Integer> distinctSocks = new HashSet<>(sockList);

        int result = 0;

        for (int sock : distinctSocks) {
            int pairs = Collections.frequency(sockList, sock) / 2;
            if (pairs > 0) result += pairs;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
