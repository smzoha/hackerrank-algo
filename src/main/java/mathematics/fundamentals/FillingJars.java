package mathematics.fundamentals;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 5/8/2018
 */
public class FillingJars {

    private static long fillingJars(int n, long[][] operationRows) {
        long total = 0;

        for (long[] operation : operationRows) {
            long startPoint = operation[0] - 1,
                    endPoint = operation[1] - 1,
                    content = operation[2];

            total += (endPoint - startPoint + 1) * content;
        }

        return Math.floorDiv(total, n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        long[][] operations = new long[m][3];

        for (int operationsRowItr = 0; operationsRowItr < m; operationsRowItr++) {
            String[] operationsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int operationsColumnItr = 0; operationsColumnItr < 3; operationsColumnItr++) {
                int operationsItem = Integer.parseInt(operationsRowItems[operationsColumnItr]);
                operations[operationsRowItr][operationsColumnItr] = operationsItem;
            }
        }

        System.out.println(fillingJars(n, operations));

        scanner.close();
    }
}
