package algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/15/2018
 */
public class SortingIntro {
    private static int introTutorial(int V, int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(V);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = introTutorial(V, arr);
        System.out.println(result);
        in.close();
    }
}