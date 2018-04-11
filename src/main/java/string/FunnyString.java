package string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/21/2018
 */
public class FunnyString {

    private static String funnyString(String s) {
        String revString = new StringBuilder(s).reverse().toString();
        boolean failed = false;

        for (int i = 1; i < s.length(); i++) {
            int absDiff = Math.abs(s.codePointAt(i) - s.codePointAt(i - 1));
            int revAbsDiff = Math.abs(revString.codePointAt(i) - revString.codePointAt(i - 1));

            if (absDiff != revAbsDiff) {
                failed = true;
                break;
            }
        }

        return failed ? "Not Funny" : "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
