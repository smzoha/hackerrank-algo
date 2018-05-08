package algorithm.implementations;

import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 3/16/2018
 */
public class CatsMouse {

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) == Math.abs(y - z)) return "Mouse C";
        else if (Math.abs(x - z) > Math.abs(y - z)) return "Cat B";
        else return "Cat A";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            System.out.println(catAndMouse(x, y, z));
        }

        in.close();
    }
}
