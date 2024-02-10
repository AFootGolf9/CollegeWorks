package main;

public class Exec4 {

    // true for male, false for female
    public static boolean exec4(boolean sex, int age, int contribuition){
   
        if(sex){
            age -= 5;
            contribuition -= 5;
        }
        return age + contribuition >= 89;
    }
}
