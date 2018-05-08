package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 1/18/18
 */

public class BreakRecord {

    private static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];

        int highestScore = scores[0];
        int lowestScore = highestScore;

        for (int score : scores) {
            if (highestScore < score) {
                highestScore = score;
                result[0]++;
            } else if (lowestScore > score) {
                lowestScore = score;
                result[1]++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}