package com.poo.classes;

public class Endereco {

    String uf;
    String cidade;
    String tipo;
    String logadouro;
    String complemento;
    String endereco;

    public void imprimirInformacoes(){

        System.out.println("UF: " + uf);
        System.out.println("Cidade: " + cidade);
        System.out.println("Tipo: " + tipo);
        System.out.println("Complemento: " + complemento);
        System.out.println("Endereço: " + endereco);

    }


}
