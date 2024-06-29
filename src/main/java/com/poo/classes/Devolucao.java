package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {

    private LocalDate dataDevolucao;

    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    public void imprimirInformacoes (){

        System.out.println("Data de devolução: " + getDataDevolucao()); 
    
        } 


}
