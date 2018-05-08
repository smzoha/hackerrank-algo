package algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/15/2018
 */
public class QuickSortPt1 {

    private static int[] quickSort(int[] arr) {
        int equal = arr[0];
        List<Integer> leftList = Arrays.stream(arr).boxed().filter(elem -> elem < equal).collect(Collectors.toList());
        List<Integer> rightList = Arrays.stream(arr).boxed().filter(elem -> elem > equal).collect(Collectors.toList());

        leftList.add(equal);
        leftList.addAll(rightList);

        return leftList.stream().mapToInt(elem -> elem).toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");


        in.close();
    }
}
