package com.aula02poo;

public class Aula02 {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Faber";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 100;
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();

        Caneta caneta2 = new Caneta();
        caneta2.modelo= "Bic";
        caneta2.cor = "Preta";
        caneta2.ponta = 0.7f;
        caneta2.carga = 50;
        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();
    }
}
