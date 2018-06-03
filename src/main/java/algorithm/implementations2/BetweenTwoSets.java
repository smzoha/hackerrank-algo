package algorithm.implementations2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 5/31/2018
 */
public class BetweenTwoSets {

    private static final Scanner scan = new Scanner(System.in);

    private static int getTotalX(int[] a, int[] b) {
        Set<Integer> factors = findFactors(b);
        factors = checkFactors(a, factors);

        return factors.size();
    }

    private static Set<Integer> findFactors(int[] numArr) {
        Set<Integer> factors = new LinkedHashSet<>();

        for (int num : numArr) {
            Set<Integer> tmpFactors = new LinkedHashSet<>();
            long range = Math.round(Math.floor(Math.sqrt(num)));

            for (int i = 1; i <= range; i++) {
                if (num % i == 0) {
                    tmpFactors.add(i);
                    tmpFactors.add(num / i);
                }
            }

            if (factors.isEmpty()) {
                factors.addAll(tmpFactors);
            } else {
                factors = tmpFactors.stream().filter(factors::contains).collect(Collectors.toSet());
            }
        }

        return factors;
    }

    private static Set<Integer> checkFactors(int[] divisors, Set<Integer> factors) {
        for (int divisor : divisors) {
            factors.removeIf(integer -> integer % divisor != 0);
        }

        return factors;
    }

    public static void main(String[] args) {
        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());
        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];
        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];
        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);
        System.out.println(total);
    }
}