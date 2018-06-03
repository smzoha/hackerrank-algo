package algorithm.implementations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 5/25/18
 */
public class TimeInWords {

    private static final Scanner scanner = new Scanner(System.in);

    private static final List<String> NUMBER_LIST = new ArrayList<>(Arrays.asList("one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"));

    private static String timeInWords(int h, int m) {
        if (m == 0) return NUMBER_LIST.get(h - 1).concat(" o' clock");
        else if (m == 30) return "half past " + NUMBER_LIST.get(h - 1);
        else if (m <= 30) return getTimeString(h, m, true);
        else {
            h += 1;
            m = 60 - m;
            return getTimeString(h, m, false);
        }
    }

    private static String getTimeString(int h, int m, boolean past) {
        String conjunctive = past ? "past " : "to ";

        if (m == 15) return "quarter " + conjunctive + NUMBER_LIST.get(h - 1);
        else if (m <= 20) return NUMBER_LIST.get(m - 1)
                + (m > 1 ? " minutes" : " minute") + " " + conjunctive
                + NUMBER_LIST.get(h - 1);
        else {
            m -= 20;
            return NUMBER_LIST.get(19) + " " + NUMBER_LIST.get(m - 1) + " minutes "
                    + conjunctive + NUMBER_LIST.get(h - 1);
        }
    }

    public static void main(String[] args) {
        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(timeInWords(h, m));

        scanner.close();
    }
}