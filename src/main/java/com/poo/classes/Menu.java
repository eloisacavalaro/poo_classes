package com.poo.classes;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean alternativa = true;

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Imprimir e calcular contracheque.");
            System.out.println("2 - Sair.");
            opcao = sc.nextInt();

            if (opcao == 1) {
                tipoFuncionario(sc);
            } else if (opcao == 2) {
                alternativa = false;
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção invalida!");
            }
        } while (alternativa);
    }

    public static void tipoFuncionario(Scanner sc) {
        Gerente gerente = new Gerente("Mili", "123-456-789-00", "12345", new Endereco(74123000), "Mili1", "12345");
        Atendente atendente = new Atendente("Pedro", "009-876-543-21", "54321", new Endereco(12314000), "Pedro1", "54321");

        System.out.println("Selecione o tipo de funcionario: ");
        System.out.println("1 - Gerente.");
        System.out.println("2 - Atendente.");
        int alternativa = sc.nextInt();

        if (alternativa == 1) {
            gerente.imprimecc();
        } else if (alternativa == 2) {
            atendente.imprimecc();
        } else {
            System.out.println("Alternativa invalida!");
        }
    }
}