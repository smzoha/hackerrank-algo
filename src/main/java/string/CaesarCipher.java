package string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/14/2018
 */
public class CaesarCipher {

    private static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        k = k > 26 ? k % 26 : k;

        for (char character : s.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                int modCharValue = character + k;

                if (Character.isLowerCase(character) && modCharValue > 122) {
                    modCharValue = 96 + (modCharValue - 122);
                }

                if (Character.isUpperCase(character) && modCharValue > 90) {
                    modCharValue = 64 + (modCharValue - 90);
                }

                result.append((char) modCharValue);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}