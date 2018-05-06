package implementations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 4/12/2018
 */
public class SeqEquation {

    private static int[] permutationEquation(int[] p) {
        List<Integer> pList = Arrays.stream(p).boxed().collect(Collectors.toList());
        int[] result = new int[p.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = pList.indexOf(pList.indexOf(i + 1) + 1) + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
