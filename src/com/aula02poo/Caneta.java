package com.aula02poo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada ? " + (this.tampada ? "Sim" : "Não"));
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }

   void rabiscar () {
      if (this.tampada == true){
            System.out.println("A caneta esta tampada, para usa-lá tire a tampa.");
        } else {
              System.out.println("A caneta está pronta para o uso." );
        }

   }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
