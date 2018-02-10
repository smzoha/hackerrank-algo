package warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class SimpleArraySum {

        private static int simpleArraySum(int[] ar) {
            return Arrays.stream(ar).sum();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int ar_i = 0; ar_i < n; ar_i++){
                ar[ar_i] = in.nextInt();
            }
            int result = simpleArraySum(ar);
            System.out.println(result);
        }
}
