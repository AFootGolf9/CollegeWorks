package main;

public class Exec6 {
    public static String exec6(int n){
        
        String result = "";

        for (int i = 1; i <= 10; i++) {
            result += n + " x " + i + " = " + (n * i) + "\n";
        }

        return result;
    }
}
