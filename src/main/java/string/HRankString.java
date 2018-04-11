package string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 4/11/2018
 */
public class HRankString {

    private static final char[] sequence = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};

    private static String hackerRankInString(String s) {
        if (sequence.length > s.length()) {
            return "NO";
        }

        int seqIndex = 0;

        for (int strIndex = 0; strIndex < s.length(); strIndex++) {
            if (s.charAt(strIndex) == sequence[seqIndex]) {
                seqIndex++;

                if (seqIndex == sequence.length) break;
            }
        }

        return seqIndex == sequence.length ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerRankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
