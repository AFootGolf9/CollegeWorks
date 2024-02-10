package main;

public class Exec3 {
    public static String exec3(String aluno, float prov1, float prov2, float proj){
        
        float finalProv = (prov1 + prov2) / 2;
        float finalGrade = (finalProv*7 + proj*3) / 10;

        String situation;
        if(finalGrade >= 6){
            situation = "Aprovado";
        } else {
            situation = "Reprovado";
        }
        
        return aluno + " - " + finalGrade + " - " + situation;
    }
}
