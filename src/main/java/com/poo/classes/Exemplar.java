package com.poo.classes;

public class Exemplar {

    private Livro exemplar;

    public Livro getExemplar(){
        return exemplar;
    }
    public void setExemplar(Livro exemplar){
        this.exemplar = exemplar;
    }
    public void imprimirInformacoes (){

        System.out.println("Livro: " + getExemplar());

        }

}
