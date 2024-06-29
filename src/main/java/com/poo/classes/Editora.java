package com.poo.classes;

public class Editora {

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void imprimirInformacoes (){

        System.out.println("Nome da editora: " + getNome());

    } 

}
