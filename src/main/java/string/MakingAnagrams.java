package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 4/11/2018
 */
public class MakingAnagrams {

    private static long makingAnagrams(String s1, String s2){
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c1 : s1.toCharArray()) {
            if (charCountMap.containsKey(c1)) {
                charCountMap.put(c1, charCountMap.get(c1) + 1);
            } else {
                charCountMap.put(c1, 1);
            }
        }

        for (char c2 : s2.toCharArray()) {
            if (charCountMap.containsKey(c2)) {
                charCountMap.put(c2, charCountMap.get(c2) - 1);
            } else {
                charCountMap.put(c2, -1);
            }
        }

        return charCountMap.values().stream().mapToInt(Math::abs).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        long result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}