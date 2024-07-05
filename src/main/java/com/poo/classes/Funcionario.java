package com.poo.classes;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private String login;
    private String senha;

    public Funcionario (String nome, String cpf, String rg, Endereco endereco, String login, String senha){
        super (nome, cpf, rg, endereco);
        this.login = login;
        this.senha = senha;
    }
    public String getLogin(){
        return login;
    }
    public String getSenha(){
        return senha;
    }
    public void setlogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public boolean autentica(String login, String senha) {
        return this.login.equals("Funcionario") && this.senha.equals("12345"); 
    }
    public void imprimecc() {
        double salario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu salario: ");
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
