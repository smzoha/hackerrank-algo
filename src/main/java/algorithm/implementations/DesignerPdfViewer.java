package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 4/12/2018
 */
public class DesignerPdfViewer {

    private static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;

        for (char letter : word.toCharArray()) {
            maxHeight = Math.max(maxHeight, h[letter - 97]);
        }

        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
