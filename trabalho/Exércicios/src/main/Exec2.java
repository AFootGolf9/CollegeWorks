package main;

import java.util.Scanner;

public class Exec2 {
    public static int[] exec2(Scanner sc){
        int diferenca;
        int pontLider, pontLanterna;

        do{
            System.out.println("Digite a pontuação do líder: ");
            pontLider = sc.nextInt();
            System.out.println("Digite a pontuação do lanterna: ");
            pontLanterna = sc.nextInt();
            diferenca = pontLider - pontLanterna;
            if(diferenca < 0){
                System.out.println("Pontuação inválida, digite novamente");
            }
        }while (diferenca < 0);

        return new int[]{diferenca / 3, diferenca % 3};
    }
}
