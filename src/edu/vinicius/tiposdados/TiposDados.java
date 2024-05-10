package edu.vinicius.tiposdados;

public class TiposDados {
    public static void main(String[] args) {
        int idade;
        int anoFabricacao = 2021;
        double salarioMinimo = 2500.33;
        float pi = 3.14F;
        long cpf = 98765432109L;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}