package com.bancodigital;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int opcao;

        do {
            System.out.println("1 - Abrir Conta Digital");
            System.out.println("2 - Fazer um depósito");
            System.out.println("3 - Fazer um saque");
            System.out.println("4 - Ver saldo da conta");
            System.out.println("9 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();

            Conta contaC = new Conta();

            if(opcao == 1) {
                System.out.println("O numero da conta é " + contaC.numero);
            }
            else if(opcao == 2)
            {
                System.out.println("Digite um valor para depósito:");
                double valor = scanner.nextDouble();
                contaC.depositar(valor);
                System.out.println("O saldo atual da conta " + contaC.numero + " é " + contaC.saldo);
            }
            else if(opcao == 3)
            {
                System.out.println("Digite um valor para saque:");
                double valor = scanner.nextDouble();
                contaC.sacar(valor);
                System.out.println("O saldo atual da conta " + contaC.numero + " é " + contaC.saldo);
            }
            else if(opcao == 4)
            {
                System.out.println("O saldo atual da conta é " + contaC.saldo);
            }
        } while (opcao != 9);
    }
}
