package main;

import java.util.Random;

public class Exec7 {
    public static char exec7(){
        Random random = new Random();
        int A = random.nextInt(6);
        int B = random.nextInt(6);

        if (A > B) {
            return 'A';
        } else if (B > A) {
            return 'B';
        } else {
            return 'E';
        }
    }
}
