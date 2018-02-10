package warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Shamah M Zoha
 * @since 1/14/18
 */
public class TimeConversion {
    static String timeConversion(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, ":");
        List<String> timeTokens = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            timeTokens.add(tokenizer.nextToken());
        }

        boolean isPM = timeTokens.get(2).contains("PM");
        String seconds = timeTokens.remove(2).substring(0, 2);

        if (!isPM) {
            String hour = timeTokens.remove(0);
            hour = hour.equalsIgnoreCase("12") ? "00" : hour;

            timeTokens.add(0, hour);
            timeTokens.add(seconds);
        } else {
            String hour = timeTokens.remove(0);
            hour = hour.equalsIgnoreCase("12") ? "12" :
                    String.valueOf(Integer.valueOf(hour) + 12);

            timeTokens.add(0, hour);
            timeTokens.add(seconds);
        }

        return String.join(":", timeTokens);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}