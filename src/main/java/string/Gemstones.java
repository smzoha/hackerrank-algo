package string;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 3/24/2018
 */
public class Gemstones {

    private static int gemstones(String[] arr) {
        Set<Integer> gemstones = arr[0].chars().distinct().boxed().collect(Collectors.toSet());

        for (int i = 1; i < arr.length; i++) {
            Set<Integer> tmpStones = arr[i].chars().distinct().boxed().collect(Collectors.toSet());
            gemstones = gemstones.stream().filter(tmpStones::contains).collect(Collectors.toSet());
        }

        return gemstones.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}