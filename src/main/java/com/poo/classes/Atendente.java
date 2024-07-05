package com.poo.classes;

import java.util.Scanner;

public class Atendente extends Funcionario{

    public Atendente(String nome, String cpf, String rg, Endereco endereco, String login, String senha){
        super(nome, cpf, rg, endereco, login, senha);
    }
    @Override
    public void imprimecc() {
        double salario;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual é o seu salário: ");
        salario = sc.nextDouble(); 

        double fgts = salario * 0.08;
        double inss = salario * 0.11;
        double salarioLiquido = salario - fgts - inss;

        System.out.println("Contracheque:" );
        System.out.println("Salário Bruto: R$" + salario);
        System.out.println("FGTS: R$" + fgts);
        System.out.println("INSS: R$" + inss);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

    }

}
