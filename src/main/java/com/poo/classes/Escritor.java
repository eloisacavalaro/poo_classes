package com.poo.classes;

public class Escritor {

    private static int contador = 1;

    private int idAutor;
    private String nome;

    public Escritor(String nome){
        this.nome = nome;
        this.idAutor = contador;
        contador++;
    }

    public int getIdAutor(){
        return idAutor;
    }
    public String getNome(){
        return nome;
    }
    public void setIdAutor(int idAutor){
        this.idAutor = idAutor;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public void imprimirInformacoes (){

        System.out.println("Nome do Autor: " + getNome());
    
    }
   

}
