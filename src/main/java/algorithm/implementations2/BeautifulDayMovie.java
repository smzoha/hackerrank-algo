package algorithm.implementations2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author smzoha
 * @since 4/28/18
 */
public class BeautifulDayMovie {

    private static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int day = i; day <= j; day++) {
            int revDay = reverseDigits(day);
            double result = Math.abs(day - revDay);
            result /= k;

            if (result % 1 == 0) count++;
        }

        return count;
    }

    private static int reverseDigits(int day) {
        StringBuilder reverseDayBuilder = new StringBuilder();

        String.valueOf(day).chars().map(i -> i - 48).boxed().collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator().forEachRemaining(reverseDayBuilder::append);

        return Integer.valueOf(reverseDayBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}