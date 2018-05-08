package algorithm.implementations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 3/14/2018
 */
public class DigitSum {
    private static int findDigits(int n) {
        List<Integer> digits = String.valueOf(n).chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());

        int count = 0;

        for (int digit : digits) {
            if (digit != 0 && n % digit == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
