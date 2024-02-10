package main;

public class Estacionamento {
    
    private String[] placa;

    public Estacionamento() {
        this.placa = new String[10];
    }

    public void addCar(String placa, int posicao){
        if (this.placa[posicao] == null) {
            this.placa[posicao] = placa;
        } else {
            System.out.println("\nPosição ocupada");
        }
    }

    public void openSpc(int posicao){
        this.placa[posicao] = null;
    }

    public void statusCheck(){
        for (int i = 0; i < this.placa.length; i++) {
            if (this.placa[i] != null) {
                System.out.println("Posição " + i + ": " + this.placa[i]);
            }else{
                System.out.println("Posição " + i + ": VAZIO");
            }
        }
    }
}
