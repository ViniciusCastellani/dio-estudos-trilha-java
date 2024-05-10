package edu.vinicius.desafios.contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroAgencia;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência");
        numeroAgencia = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o nome da Agência");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                           ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");
    }
}