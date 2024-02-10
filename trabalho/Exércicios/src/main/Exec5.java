package main;

import java.util.Scanner;

public class Exec5 {
    public static void exec5(Scanner sc){
        System.out.println("Login:");
        String login = sc.nextLine();
        
        boolean valid = false;

        for (int i = 3; i > 0; i--) {
            System.out.println("Senha:");
            String password = sc.nextLine();
            if (password.equals("batatinha123")) {
                valid = true;
                break;
            } else {
                System.out.println("Senha inválida. Você tem mais " + (i - 1) + " tentativas.");
            }
        }
        
        if (valid) {
            System.out.println("Bem vindo, " + login + " !");
        } else {
            System.out.println("Usuário bloqueado. Contate o administrador.");
        }
    }
}
