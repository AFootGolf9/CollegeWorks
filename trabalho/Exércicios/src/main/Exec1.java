package main;

import java.util.Scanner;

public class Exec1 {
    public static int exec1(Scanner sc){

        int pontLider, pontLanterna;
        int diferenca;
        
        do{
            System.out.println("Digite a pontuação do líder: ");
            pontLider = sc.nextInt();
            System.out.println("Digite a pontuação do lanterna: ");
            pontLanterna = sc.nextInt();
            diferenca = pontLider - pontLanterna;
            if(diferenca < 0){
                System.out.println("Pontuação inválida, digite novamente");
            }
        }while(diferenca < 0);

        float diferencaFloat = (float) diferenca;
        return (int) Math.ceil(diferencaFloat / 3);
    }
}
