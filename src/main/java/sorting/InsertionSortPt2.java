package sorting;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/15/2018
 */
public class InsertionSortPt2 {

    private static void insertionSort2(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[minIndex]) {
                    swap(arr, minIndex, j);
                    minIndex = j;
                }
            }

            System.out.println(formatArr(arr));
        }
    }

    private static void swap(int[] arr, int elemIndex, int swapIndex) {
        int tmpVal = arr[swapIndex];
        arr[swapIndex] = arr[elemIndex];
        arr[elemIndex] = tmpVal;
    }

    private static String formatArr(int[] arr) {
        StringBuilder str = new StringBuilder();

        for (int elem : arr) {
            str.append(elem).append(" ");
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
