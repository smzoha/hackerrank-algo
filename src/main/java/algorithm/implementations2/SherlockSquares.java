package algorithm.implementations2;

import java.util.Scanner;

/**
 * @author smzoha
 * @since 5/23/18
 */
public class SherlockSquares {

    private static long squares(int a, int b) {
        return Math.round(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            System.out.println(squares(a, b));
        }

        scanner.close();
    }
}