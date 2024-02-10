package main;

import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Runner runner = new Runner();

        System.out.println("Qual dos exercicios deseja executar?");
        int exercicio = sc.nextInt();

        switch (exercicio) {
            case 1:
                runner.run1(sc);
                break;
            case 2:
                runner.run2(sc);
                break;
            case 3:
                runner.run3(sc);
                break;
            case 4:
                runner.run4(sc);
                break;
            case 5:
                runner.run5(sc);
                break;
            case 6:
                runner.run6(sc);
                break;
            case 7:
                runner.run7();
                break;
            case 8:
                runner.run8(sc);
                break;
            case 9:
                runner.run9();
                break;
            case 10:
                runner.run10(sc);
                break;
            default:
                break;
        }
    }
}
