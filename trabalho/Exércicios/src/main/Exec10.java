package main;

import java.util.Scanner;

public class Exec10 {
    public static void exec10(Scanner sc){

        Estacionamento est = new Estacionamento();

        boolean loop = true;

        while (loop) {
            System.out.println("\n1 - Adicionar carro\n2 - Liberar vaga\n3 - Verificar status\n4 - Sair");
            int option = sc.nextInt();

            String placa;
            switch (option) {
                case 1:
                    System.out.println("Digite a placa do carro: ");
                    placa = sc.next();
                    System.out.println("Digite a posição: ");
                    int pos = sc.nextInt();
                    est.addCar(placa, pos);
                    break;
                case 2:
                    System.out.println("Digite a posição: ");
                    int pos2 = sc.nextInt();
                    est.openSpc(pos2);
                    break;
                case 3:
                    est.statusCheck();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
