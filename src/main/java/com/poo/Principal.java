package com.poo;

public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.setModelo("Ford");
        meuCarro.setAnoFabricacao(2022);
        meuCarro.setCor("Preto");
        meuCarro.setFabricante("Chevrolet");
        meuCarro.proprietario.setNome("João");
        meuCarro.proprietario.setCpf("999.999.000.99");
        meuCarro.proprietario.setAnoNascimento(2000);
        meuCarro.setAnoFabricacao(2025);
        meuCarro.setAnosUsado(2027);
        meuCarro.setPrecoCompra(80000);

        meuCarro.imprimirResumoDepreciacao();
    }
}