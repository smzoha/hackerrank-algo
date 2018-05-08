package algorithm.string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 4/11/2018
 */

public class BeautifulBinaryString {

    private static int beautifulBinaryString(String b) {
        return b.length() - b.replaceAll("010", "**").length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}