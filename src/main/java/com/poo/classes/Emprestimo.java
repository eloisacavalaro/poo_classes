package com.poo.classes;

import java.time.LocalDate;

public class Emprestimo {

    String emprestimo;
LocalDate dataDoEmprestimo;
LocalDate dataPrevistaDevolucao;

public void imprimirInformacoes (){

    System.out.println("Empretimo: " + emprestimo);
    System.out.println("Data do Emprestimo: " + dataDoEmprestimo);
    System.out.println("Data prevista para a devolução: " + dataPrevistaDevolucao);
    }


}
