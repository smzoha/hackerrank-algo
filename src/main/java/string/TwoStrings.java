package string;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 3/30/2018
 */
public class TwoStrings {

    private static String twoStrings(String s1, String s2){
        List<Character> refChars = s1.chars()
                .distinct()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        return s2.chars()
                .mapToObj(c -> (char) c)
                .filter(refChars::contains)
                .count() > 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
