package mathematics.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author smzoha
 * @since 5/12/18
 */
public class IsFibo {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Long> fiboList = new ArrayList<>(Arrays.asList(0L, 1L));

    private static final String IS_FIBO = "IsFibo";
    private static final String IS_NOT_FIBO = "IsNotFibo";

    private static String isFibo(long n) {
        if (fiboList.contains(n)) {
            return IS_FIBO;
        } else {
            long lastFibo = fiboList.get(fiboList.size() - 1);

            while (lastFibo < n) {
                lastFibo = fiboList.get(fiboList.size() - 1) + fiboList.get(fiboList.size() - 2);
                fiboList.add(lastFibo);

                if (lastFibo == n) return IS_FIBO;
            }

            return IS_NOT_FIBO;
        }
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = isFibo(n);
            System.out.println(result);
        }

        scanner.close();
    }
}