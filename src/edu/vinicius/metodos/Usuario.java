package edu.vinicius.metodos;

public class Usuario {
    public static void main(String[] args) {
        //Cria um objeto do tipo SmartTv
        SmartTv tv = new SmartTv();

        System.out.println("Status inicial -> Tv está ligada? " + tv.ligada);
        System.out.println("Status inicial -> Volume atual: " + tv.volume);
        System.out.println("Status inicial -> Canal atual: " + tv.canal);
        System.out.println();

        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.aumentarCanal();
        tv.mudarCanal(40);
        tv.diminuirCanal();

        System.out.println();
        System.out.println("Novo status -> Tv está ligada? " + tv.ligada);
        System.out.println("Novo status -> Volume atual: " + tv.volume);
        System.out.println("Novo status -> Canal atual: " + tv.canal);
    }
}