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

        if(precoCompra <= 0){
            System.out.println("Carro com preço de compra zerado. Não foi possível imprimir o tempo de depreciação");
            return; // sairá de do método
            //ou por exemplo , no documento informar algo importante
        }

        System.out.println("Tempo de uso " + tempoDeUsoCarro);
        System.out.println("Valor de revenda " + valorRevenda);
    }

    double calcularIpva(){

        double tempoDeUsoEmAnos = calculoValorRevenda();
        if(tempoDeUsoEmAnos * 0.04 >= 10){
            // se cair aqui , estará isento e sairá de todo o método pois está com return
            return 0; // isento
        }
        if (tempoDeUsoEmAnos <= 0){
            System.out.println("Não foi possível calcular o IPVA pois o tempo de uso está zerado");
            return 0.0;
        }
        return tempoDeUsoEmAnos * 0.04;
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

    public int getAnosUsado() {
        return anosUsado;
    }

    public void setAnosUsado(int anosUsado) {
        this.anosUsado = anosUsado;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", proprietario=" + proprietario +
                '}';
    }
}
