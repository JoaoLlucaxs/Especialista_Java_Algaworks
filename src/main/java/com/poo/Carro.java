package com.poo;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    int anosUsado;
    double precoCompra;

    // Composição - Relação Tem- Um
    Pessoa proprietario = new Pessoa(); // evitando NullPointer

    void imprimirResumoDepreciacao(){
        double valorRevenda = calculoValorRevenda();
        int tempoDeUsoCarro = calculaTempoDeUso();

        System.out.println("Tempo de uso " + tempoDeUsoCarro);
        System.out.println("Valor de revenda " + valorRevenda);
    }

    double calcularIpva(){
        return calculoValorRevenda() * 0.04;
    }

    int calculaTempoDeUso(){
        int tempoDeUsoEmAnos = anosUsado - anoFabricacao;
        return  tempoDeUsoEmAnos;
    }

    double calculoValorRevenda() {
        int valorUso = calculaTempoDeUso();

        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - valorUso);

        if(valorRevenda < 0 && valorUso < 0){
            valorRevenda =0;
            valorUso = 0;
        }

        return valorRevenda;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getAnosUsado() {
        return anosUsado;
    }

    public void setAnosUsado(int anosUsado) {
        this.anosUsado = anosUsado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", anosUsado=" + anosUsado +
                ", precoCompra=" + precoCompra +
                ", proprietario=" + proprietario +
                '}';
    }
}
