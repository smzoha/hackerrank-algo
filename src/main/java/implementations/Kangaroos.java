package implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 1/18/18
 */
public class Kangaroos {

    private static final String YES_STRING = "YES";
    private static final String NO_STRING = "NO";

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        while ((x1 + v1) - (x2 + v2) < v1 && v1 != v2) {
            if (x1 == x2) {
                return YES_STRING;
            }

            x1 += v1;
            x2 += v2;
        }

        return NO_STRING;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
