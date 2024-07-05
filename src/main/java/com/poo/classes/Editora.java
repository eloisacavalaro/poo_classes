package com.poo.classes;

public class Editora {
    private static int contador = 1;

    private int idEditora;
    private String nome;

    public Editora (String nome){
        this.nome = nome;
        this.idEditora = contador;
        contador++;
    }
    public int getIdEditora(){
        return idEditora;
    }
    public String getNome(){
        return nome;
    }
    public void setIdEditora(int idEditora){
        this.idEditora = idEditora;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void imprimirInformacoes (){

        System.out.println("Nome da editora: " + getNome());

    } 

}
