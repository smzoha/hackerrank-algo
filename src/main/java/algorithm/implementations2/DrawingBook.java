package algorithm.implementations2;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 6/2/18
 */
public class DrawingBook {

    private static final Scanner scanner = new Scanner(System.in);

    private static int pageCount(int n, int p) {
        return Math.min(p / 2, n % 2 == 0 ? (++n - p) / 2 : (n - p) / 2);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        System.out.println(pageCount(n, p));

        scanner.close();
    }
}