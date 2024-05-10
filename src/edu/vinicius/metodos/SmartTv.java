package edu.vinicius.metodos;

public class SmartTv {
    boolean ligada = false;
    int volume = 15;
    int canal = 25;

    public void ligar(){
        System.out.println("Ligando Tv...");
        this.ligada = true;
    }

    public void desligar(){
        System.out.println("Desligando Tv...");
        this.ligada = false;
    }

    public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo volume para " + this.volume);
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando volume para " + this.volume);
    }

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
        System.out.println("Trocando canal para " + this.canal);
    }

    public void aumentarCanal(){
        this.canal++;
        System.out.println("Aumentando canal para " + this.canal);
    }

    public void diminuirCanal(){
        this.canal--;
        System.out.println("Diminuindo canal para " + this.canal);
    }
}