package main;

public class Exec8 {
    public static String exec8(String frase){

        String out = "";

        out += "Quantidade de caracteres: " + frase.length() + "\n";
        out += "Frase em maiúsculo: " + frase.toUpperCase() + "\n";
        out += "Primeiro \"a\": " + frase.indexOf('a') + "\n";
        
        String contrario = invertString(frase);
        out += "Frase ao contrário: " + contrario + "\n";
        
        boolean result = frase.replaceAll(" ", "").equals(contrario.replaceAll(" ", ""));
        out += "É palíndromo: " + result + "\n";

        return out;
    }

    private static String invertString(String str){
        String out = "";
        for (int i = str.length()-1; i >= 0; i--) {
            out += str.charAt(i);
        }
        return out;
    }
}
