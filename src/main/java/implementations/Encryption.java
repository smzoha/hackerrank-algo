package implementations;

import java.util.Scanner;

/**
 * @author smzoha
 * @since 4/28/18
 */
public class Encryption {

    private static String encryption(String s) {
        double sqrtLen = Math.sqrt(s.length());
        int gridRows = (int) Math.round(Math.ceil(sqrtLen));

        String[] grid = new String[gridRows];
        int startPoint = 0;

        for (int i = 0; i < gridRows; i++) {
            int endPoint = endPoint(startPoint, s.length(), gridRows);
            grid[i] = s.substring(startPoint, endPoint);
            startPoint = endPoint;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < gridRows; i++) {
            for (String rowStr : grid) {
                if (i < rowStr.length()) builder.append(rowStr.charAt(i));
            }

            builder.append(" ");
        }

        return builder.toString().trim();
    }

    private static int endPoint(int count, int length, int nRow) {
        count += nRow;
        return count < length ? count : length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}