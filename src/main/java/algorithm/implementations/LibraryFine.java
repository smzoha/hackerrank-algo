package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/16/2018
 */
public class LibraryFine {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int returnDay = scan.nextInt();
        int returnMonth = scan.nextInt();
        int returnYear = scan.nextInt();

        int dueDay = scan.nextInt();
        int dueMonth = scan.nextInt();
        int dueYear = scan.nextInt();

        System.out.println(returnYear > dueYear ? "10000" :
                returnMonth > dueMonth && returnYear == dueYear ? (returnMonth - dueMonth) * 500  :
                        returnDay > dueDay && returnMonth == dueMonth && returnYear == dueYear ?
                                (returnDay - dueDay) * 15 : 0);
    }
}
