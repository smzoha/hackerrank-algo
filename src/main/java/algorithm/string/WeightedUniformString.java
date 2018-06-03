package algorithm.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Shamah M Zoha
 * @since 5/26/2018
 */
public class WeightedUniformString {

    private static final Scanner scanner = new Scanner(System.in);

    private static String[] weightedUniformStrings(String s, int[] queries) {
        Set<Integer> weightSet = getWeightSet(s);
        String[] result = new String[queries.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = weightSet.contains(queries[i]) ? "Yes" : "No";
        }

        return result;
    }

    private static Set<Integer> getWeightSet(String s) {
        Set<Integer> weightSet = new LinkedHashSet<>();
        int ref = 0, sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (ref == 0 || ref != s.codePointAt(i)) {
                ref = s.codePointAt(i);
                weightSet.add(sum = ref - 96);
            } else {
                weightSet.add(sum += (ref - 96));
            }
        }

        return weightSet;
    }

    public static void main(String[] args) {
        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] results = weightedUniformStrings(s, queries);

        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}