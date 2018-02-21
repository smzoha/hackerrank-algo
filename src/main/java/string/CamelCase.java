package string;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 2/14/2018
 */
public class CamelCase {
    static int camelcase(String s) {
        return s.chars().mapToObj(c -> (char) c).filter(Character::isUpperCase).collect(Collectors.toList()).size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
