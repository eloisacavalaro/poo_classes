package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {
    private static int contador = 1;

    private int idDevolucao;
    private LocalDate dataDevolucao;

    public Devolucao(){
        this.idDevolucao = contador;
        contador++;
    }
    public int getIdDevolucao(){
        return idDevolucao;
    }
    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }
    public void setIdDevolucao(int idDevolucao){
        this.idDevolucao = idDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    public void imprimirInformacoes (){

        System.out.println("Data de devolução: " + getDataDevolucao()); 
    
        } 


}
