package implementations;

import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigInteger.*;

/**
 * @author Shamah M Zoha
 * @since 3/16/2018
 */
public class ExtraLongFactorials {

    private static void extraLongFactorials(int n) {
        System.out.println(factorial(valueOf(n)));
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(ONE)) return ONE;
        else return n.multiply(factorial(n.subtract(ONE)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}