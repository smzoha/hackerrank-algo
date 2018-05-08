package algorithm.implementations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 18-Jan-18
 */
public class BirthdayBar {

    private static int solve(int[] s, int d, int m){
        List<Integer> pieceList = Arrays.stream(s).boxed().collect(Collectors.toList());
        int sumCount = 0;

        for (int count = 0; count < pieceList.size(); count++) {
            if (count + m <= pieceList.size()) {
                if (pieceList.subList(count, count + m).stream().mapToInt(Integer::intValue).sum() == d) {
                    sumCount++;
                }
            }
        }

        return sumCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(s, d, m);
        System.out.println(result);
    }
}
