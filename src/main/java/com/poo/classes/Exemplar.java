package com.poo.classes;

public class Exemplar {
    private static int contador = 1;

    private int idExemplar;
    private Livro exemplar;

    public Exemplar (){
        this.idExemplar = contador;
        contador++;
    }
    public int getIdExemplar(){
        return idExemplar;
    }
    public Livro getExemplar(){
        return exemplar;
    }
    public void setIdExemplar(int idExemplar){
        this.idExemplar = idExemplar;
    }
    public void setExemplar(Livro exemplar){
        this.exemplar = exemplar;
    }
    public void imprimirInformacoes (){

        System.out.println("Livro: " + getExemplar());

        }

}
