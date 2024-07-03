package com.poo.classes;

public class Autor {

    private static int contador = 1;

    private int idAutor;
    private String nome;

    public Autor(String nome){
        this.nome = nome;
        this.idAutor = contador;
        contador++;
    }

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
