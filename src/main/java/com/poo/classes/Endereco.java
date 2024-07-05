package com.poo.classes;

public class Endereco {

    private static int contador = 1;

    private int idEndereco;
    private int cep;
    private String uf;
    private String cidade;
    private String tipo;
    private String logradouro;
    private String complemento;

    public Endereco (int cep){
        this.cep = cep;
        this.idEndereco = contador;
        contador++;
    }
    public Endereco(String string, String string2, String string3, String string4) {
    }
    public int getIdEndereco(){
        return idEndereco;
    }
    public int getCep(){
        return cep;
    }
    public String getUf(){
        return uf;
    }
    public String getCidade(){
        return cidade;
    }
    public String getTipo(){
        return tipo;
    }
    public String getLogadouro(){
        return logradouro;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setIdAutor(int idEndereco){
        this.idEndereco = idEndereco;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public void setUf(String uf){
        if (uf != null && uf.matches("^[A-Z]{2}$")) {
            this.uf = uf;
        } else {
            throw new IllegalArgumentException("UF inválido. Deve ter exatamente 2 letras maiúsculas.");
        }
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setTipo( String tipo){
        this.tipo = tipo;
    }
    public void setLogadouro( String logadouro){
        this.logradouro = logadouro;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public void imprimirInformacoes(){

        System.out.println("CEP: " + getCep());
        System.out.println("UF: " + getUf());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Complemento: " + getComplemento());

    }

}
