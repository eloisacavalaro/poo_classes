package com.poo.classes;

public class Endereco {

    private String uf;
    private String cidade;
    private String tipo;
    private String logradouro;
    private String complemento;

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

        System.out.println("UF: " + getUf());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Complemento: " + getComplemento());

    }

}
