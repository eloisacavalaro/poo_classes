package com.poo.classes;

import java.time.LocalDate;

public class Emprestimo {
    private static int contador = 1;

    private int idEmprestimo;
    private String emprestimo;
    private LocalDate dataDoEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private Pessoa cliente;

    public Emprestimo (){
        this.idEmprestimo = contador;
        contador++;
    }
    public int idEmprestimo(){
        return idEmprestimo;
    }
    public String getEmprestimo(){
        return emprestimo;
    }
    public LocalDate getDataDoEmprestimo(){
        return dataDoEmprestimo;
    }
    public LocalDate getDataPrevistaDevolucao(){
        return dataPrevistaDevolucao;
    }
    public Pessoa getCliente(){
        return cliente;
    }
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }
    public void setEmprestimo(String emprestimo){
        this.emprestimo = emprestimo;
    }
    public void setDataDoEmprestimo(LocalDate dataDoEmprestimo){
        this.dataDoEmprestimo = dataDoEmprestimo;
    }
    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao){
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }
    public void setCliente(Pessoa cliente){
        this.cliente = cliente;
    }
    public void imprimirInformacoes (){

        System.out.println("Empretimo: " + getEmprestimo());
        System.out.println("Data do Emprestimo: " + getDataDoEmprestimo());
        System.out.println("Data prevista para a devolução: " + getDataPrevistaDevolucao());
        System.out.println("Dados do cliente: " + getCliente());
        }

}
