package string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/24/2018
 */
public class AlternateChars {

    private static int alternatingCharacters(String s) {
        char refChar = s.charAt(0);
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == refChar) {
                count++;
            } else {
                refChar = s.charAt(i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
