package com.poo.classes;

public class Livro {
    private static int contador = 1;

    private int idLivro;
    private String edicao;
    private String titulo;
    private int ano;

    public Livro(String edicao, String titulo, int ano){
        this.edicao = edicao;
        this.titulo = titulo;
        this.ano = ano;
        this.idLivro = contador;
        contador++;
    }

    public String getEdicao(){
        return edicao;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAno(){
        return ano;
    }
    public void setEdicao(String edicao){
        this.edicao = edicao;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAno(int ano){
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano deve ser um valor positivo.");
        }
    }
    public void imprimirInformacoes (){

        System.out.println("Edição: " + getEdicao());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano: " + getAno());
    }
    
}
