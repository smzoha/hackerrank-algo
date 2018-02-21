package implementations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/9/2018
 */
public class MigratoryBirds {

    private static int migratoryBirds(int[] ar) {
        List<Integer> birdsList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        int prevFrequency = 0, result = -1;

        for (int i = 0; i < 6; i++) {
            int frequency = Collections.frequency(birdsList, i);

            if (frequency > prevFrequency) {
                prevFrequency = frequency;
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(ar);
        System.out.println(result);
    }
}
