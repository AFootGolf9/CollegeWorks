package main;

import java.util.Scanner;

public class Runner {
    public void run1(Scanner sc){
        System.out.println(Exec1.exec1(sc));
    }

    public void run2(Scanner sc){
        int[] result = Exec2.exec2(sc);
        System.out.println("victories: " + result[0] + "\ndefeats: " + result[1]);
    }

    public void run3(Scanner sc){
        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.next();
        System.out.println("Digite a nota da prova 1: ");
        float prov1 = sc.nextFloat();
        System.out.println("Digite a nota da prova 2: ");
        float prov2 = sc.nextFloat();
        System.out.println("Digite a nota do projeto: ");
        float proj = sc.nextFloat();
        System.out.println(Exec3.exec3(aluno, prov1, prov2, proj));
    }

    public void run4(Scanner sc){
        sc.nextLine();
        System.out.println("Digite o sexo (M para masculino, F para feminino): ");
        String option = sc.nextLine();
        boolean sex;
        if (option.equals("M")) {
            sex = true;
        } else {
            sex = false;
        }
        System.out.println("Digite a idade: ");
        int age = sc.nextInt();
        System.out.println("Digite o tempo de contribuição: ");
        int contribuition = sc.nextInt();

        System.out.println(Exec4.exec4(sex, age, contribuition));
    }

    public void run5(Scanner sc){
        sc.nextLine();
        Exec5.exec5(sc);
    }

    public void run6(Scanner sc){
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.println(Exec6.exec6(n));
    }

    public void run7(){
        char temp = Exec7.exec7();
        if (temp == 'A') {
            System.out.println("A venceu");
        } else if (temp == 'B') {
            System.out.println("B venceu");
        } else {
            System.out.println("Empate");
        }
    }

    public void run8(Scanner sc){
        sc.nextLine();
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println(Exec8.exec8(frase));
    }

    public void run9(){
        int[][] mtx = Exec9.exec9();
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void run10(Scanner sc){
        Exec10.exec10(sc);
    }
}
