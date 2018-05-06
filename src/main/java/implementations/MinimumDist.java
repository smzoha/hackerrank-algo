package implementations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 4/27/2018
 */
public class MinimumDist {

    private static int minimumDistances(int[] a) {
        List<Integer> uniqueNodes = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
        int resultDist = Integer.MAX_VALUE;

        for (int node : uniqueNodes) {
            int startPoint = -1, endPoint = -1;

            for (int i = 0; i < a.length; i++) {
                if (node == a[i]) {
                    if (startPoint < 0) {
                        startPoint = i + 1;
                    } else {
                        endPoint = i + 1;
                        break;
                    }
                }
            }

            if (startPoint > 0 && endPoint > 0) {
                resultDist = Math.min(Math.abs(endPoint - startPoint), resultDist);
            }
        }

        return resultDist == Integer.MAX_VALUE ? -1 : resultDist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}