package algorithm.implementations2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 6/1/18
 */
public class PickingNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    private static long pickingNumbers(int[] a) {
        List<Integer> sortedElems = Arrays.stream(a).sorted().boxed().collect(Collectors.toList());
        long maxSubsetSize = 0;

        for (int index = 0; index < sortedElems.size(); index++) {
            int elem = sortedElems.get(index);

            maxSubsetSize = Math.max(maxSubsetSize, sortedElems.subList(index, sortedElems.size()).stream()
                    .filter(i -> Math.abs(i - elem) <= 1).count());
        }

        return maxSubsetSize;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        long result = pickingNumbers(a);
        System.out.println(result);

        scanner.close();
    }
}