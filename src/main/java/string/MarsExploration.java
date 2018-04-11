package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 4/11/2018
 */
public class MarsExploration {

    private static int marsExploration(String s) {
        List<String> sosList = new ArrayList<>();

        for (int i = 0; i < s.length(); i += 3) {
            sosList.add(s.substring(i, i + 3));
        }

        int count = 0;

        for (String sosString : sosList) {
            if (sosString.charAt(0) != 'S') count++;
            if (sosString.charAt(1) != 'O') count++;
            if (sosString.charAt(2) != 'S') count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
