package com.poo.classes;

public class Pessoa {
    private static int contador = 1;

    private int idPessoa;
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String rg,Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.idPessoa = contador;
        contador++;
    }
    public int getIdPessoa(){
        return idPessoa;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getRg(){
        return rg;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        String cpfNumerico = cpf.replaceAll("\\D", "");
        if ((cpfNumerico.length())==11) {

            this.cpf = cpf;
        }
    }
    public void setRg(String rg){
       String rgNumerico = rg.replaceAll("\\D", "");
        if ((rgNumerico.length())==9) {

            this.rg = rg;
        }
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void imprimirInformacoes (){

        System.out.println("Nome: " + getNome());  
        System.out.println("RG: " + getRg());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());

    }

}
