package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class CountingValleys {

    private static int countingValleys(int n, String s) {
        int level = 0, count = 0;
        boolean counting = false;

        for (char step : s.toCharArray()) {
            if (step == 'U') {
                level++;
            } else {
                level--;
            }

            if (level < 0) {
                counting = true;
            } else {
                if (counting) {
                    count++;
                    counting = false;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
