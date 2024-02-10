package main;

import java.util.Random;

public class Exec9 {
    public static int[][] exec9() {

        Random rand = new Random();

        int[][] mtx = new int[10][10];
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = rand.nextInt(256);
            }
        }
        
        return mtx;
    }
}
