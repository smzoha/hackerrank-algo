package warmup;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/10/2018
 */
public class Staircase {

    private static void staircase(int n) {
        for (int levelIndex = 0; levelIndex < n; levelIndex++) {
            for (int spaceIndex = n - levelIndex; spaceIndex > 1; spaceIndex--) {
                System.out.print(' ');
            }

            for (int hashIndex = 0; hashIndex < levelIndex + 1; hashIndex++) {
                System.out.print('#');
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
