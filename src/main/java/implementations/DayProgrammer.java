package implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 2/14/2018
 */
public class DayProgrammer {

    private static String dayOfProgrammer(int year){
        boolean leap = (year < 1918 && year % 4 == 0)
                || (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));

        if (year != 1918) {
            return leap ? "12.09." + year : "13.09." + year;
        } else {
            return "27.09.1918";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = dayOfProgrammer(year);
        System.out.println(result);
    }
}
