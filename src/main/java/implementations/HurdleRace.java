package implementations;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/13/2018
 */
public class HurdleRace {

    private static int hurdleRace(int k, int[] height) {
        int maxHeight = Arrays.stream(height).max().getAsInt();
        return maxHeight < k ? 0 : maxHeight - k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
