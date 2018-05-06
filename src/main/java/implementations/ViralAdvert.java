package implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 4/12/2018
 */

public class ViralAdvert {

    private static int viralAdvertising(int n) {
        int shared = 5, liked = 0, cumulative = 0;

        for (int i = 0; i < n; i++) {
            liked = shared / 2;
            shared = liked * 3;
            cumulative += liked;
        }

        return cumulative;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
