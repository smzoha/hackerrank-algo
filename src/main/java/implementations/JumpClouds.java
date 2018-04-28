package implementations;

import java.util.Scanner;

/**
 * @author smzoha
 * @since 4/28/18
 */
public class JumpClouds {

    private static int jumpingOnClouds(int[] c) {
        int count = 0, i = 0;

        while (i < c.length - 1) {
            if (i + 2 < c.length && c[i + 2] != 1) {
                i += 2;
            } else if (i + 1 < c.length) {
                i += 1;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}