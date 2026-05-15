package com.companhiaaerea;

public class Aeronave {

    private boolean Isativo = false;
    private int totalAssentos;
    private int assentosReservados;


    int calcularAssentosDisponiveis(){
        int assentosDisponíveis = totalAssentos - assentosReservados;
        return  assentosDisponíveis;
    }

    void reservarAssentos(int numerosAssentos){
        if (Isativo){
            assentosReservados+=numerosAssentos;
        }
    }

    void desativar(){
        Isativo = false;
    }

    void ativar(){
        Isativo =true;
    }

    public boolean isIsativo() {
        return Isativo;
    }

    public void setIsativo(boolean isativo) {
        Isativo = isativo;
    }

    public int getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(int totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }

    public void setAssentosReservados(int assentosReservados) {
        this.assentosReservados = assentosReservados;
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "Isativo=" + Isativo +
                ", totalAssentos=" + totalAssentos +
                ", assentosReservados=" + assentosReservados +
                '}';
    }
}
