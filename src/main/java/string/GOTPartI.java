package string;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Shamah M Zoha
 * @since 4/2/2018
 */
public class GOTPartI {

    private static String gameOfThrones(String s){
        List<Character> charList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> distinctCharList = charList.stream().distinct().collect(Collectors.toList());

        boolean oddExists = false, result = false;

        for (Character character : distinctCharList) {
            if (charList.stream().filter(c -> c.equals(character)).count() % 2 == 0) {
                result = true;
            } else {
                if (oddExists) {
                    result = false;
                    break;
                } else {
                    oddExists = true;
                }
            }
        }

        return result ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
