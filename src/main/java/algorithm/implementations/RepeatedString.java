package algorithm.implementations;

import java.util.Scanner;
import java.util.function.IntPredicate;

/**
 * @author Shamah M Zoha
 * @since 2/16/2018
 */
public class RepeatedString {

    private static long repeatedString(String s, long n) {
        IntPredicate aFilter = c -> c == 'a';

        long aCount = s.chars().filter(aFilter).count();
        long completeStrLen = aCount * ((n / s.length()) * s.length());
        long remainderAs = completeStrLen > n ? 0L :
                s.substring(0, (int) (n - completeStrLen)).chars().filter(aFilter).count();

        return completeStrLen + remainderAs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
