package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/16/2018
 */
public class GradingStudents {

    private static final int MULTIPLE_FACTOR = 5;

    private static int[] solve(int[] grades) {
        for (int indx = 0; indx < grades.length; indx++) {
            int nextGrade = (grades[indx] / MULTIPLE_FACTOR + 1) * 5;

            if (nextGrade >= 40 && nextGrade - grades[indx] < 3) {
                grades[indx] = nextGrade;
            }
        }

        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}