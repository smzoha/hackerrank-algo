package algorithm.string;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/16/2018
 */
public class StrongPass {

    private static int minimumNumber(int n, String password) {
        boolean hasNumber = false, hasUpper = false, hasLower = false, hasSpecial = false;

        for (Character character : password.toCharArray()) {
            if (Character.isDigit(character)) hasNumber = true;
            else if (Character.isUpperCase(character)) hasUpper = true;
            else if (Character.isLowerCase(character)) hasLower = true;
            else hasSpecial = true;
        }

        int additionalCharacters = addCharacters(hasNumber, hasUpper, hasLower, hasSpecial);
        additionalCharacters = n + additionalCharacters < 6 ? additionalCharacters + (6 - n - additionalCharacters)
                : additionalCharacters;

        return additionalCharacters;
    }

    private static int addCharacters(boolean hasNumber, boolean hasUpper, boolean hasLower, boolean hasSpecial) {
        int additionalCharacters = 0;

        if (!hasNumber) additionalCharacters++;
        if (!hasUpper) additionalCharacters++;
        if (!hasLower) additionalCharacters++;
        if (!hasSpecial) additionalCharacters++;

        return additionalCharacters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}