package com.poo.classes;

public class Pessoa {

    String nome;
    String cpf;
    int rg;
    String endereco;

    public void imprimirInformacoes (){

        System.out.println("Nome: " + nome);  
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);

    }


}
