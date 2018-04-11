package string;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 3/20/2018
 */

public class PangramTest {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String queryString = scan.nextLine().toLowerCase();

        int alphaCount = queryString.chars().boxed().collect(Collectors.toSet()).size();

        System.out.println(alphaCount != 27 ? "not pangram" : "pangram");
    }
}