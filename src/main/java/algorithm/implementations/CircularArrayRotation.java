package algorithm.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/16/2018
 */
public class CircularArrayRotation {

    private static int[] circularArrayRotation(int[] a, int k, int[] m) {
        List<Integer> elements = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            elements.add(0, elements.remove(elements.size() - 1));
        }

        for (int query : m) {
            result.add(elements.get(query));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, k, m);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
