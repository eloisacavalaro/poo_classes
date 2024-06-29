package com.poo.classes;

public class Pessoa {

    private String nome;
    String cpf;
    int rg;
    Endereco endereco;

    public void imprimirInformacoes (){

        System.out.println("Nome: " + nome);  
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);

    }


}
