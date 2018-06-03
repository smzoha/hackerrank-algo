package mathematics.fundamentals;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 5/23/18
 */
public class DancingPairs {

    private static final Scanner scanner = new Scanner(System.in);

    private static String dancingPairs(long i) {
        return Math.floor(sqrt(i + 1)) % 2 == 1 ? "odd" : "even";
    }

    public static void main(String[] args)  {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long i = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            System.out.println(dancingPairs(i));
        }

        scanner.close();
    }

    private static double sqrt(double n) {
        double low = 0, high = n + 1;
        while ((high - low) > 0.00001) {
            double mid = (high + low) / 2;

            if (Math.pow(mid, 2) < n) low = mid;
            else high = mid;
        }

        return low;
    }
}