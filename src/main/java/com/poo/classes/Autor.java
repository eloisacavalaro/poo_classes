package com.poo.classes;

public class Autor {

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public void imprimirInformacoes (){

        System.out.println("Nome do Autor: " + getNome());
    
    }

}
