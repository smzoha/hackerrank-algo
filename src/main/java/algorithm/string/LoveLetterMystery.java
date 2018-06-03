package algorithm.string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 5/26/2018
 */
public class LoveLetterMystery {

    private static final Scanner scanner = new Scanner(System.in);

    private static int theLoveLetterMystery(String s) {
        int operations = 0;

        for (int i = 0, j = s.length() - 1; j > i; j--, i++) {
            if (s.codePointAt(i) > s.codePointAt(j)) {
                operations += s.codePointAt(i) - s.codePointAt(j);
            } else if (s.codePointAt(j) > s.codePointAt(i)) {
                operations += s.codePointAt(j) - s.codePointAt(i);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            System.out.println(theLoveLetterMystery(s));
        }

        scanner.close();
    }
}
