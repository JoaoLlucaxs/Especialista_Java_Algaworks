package com.companhiaaerea;

public class Principal {

    public static void main(String[] args) {

        Aeronave aviaGOL = new Aeronave();
        aviaGOL.setTotalAssentos(100);

        //aviaGOL.desativar();
        aviaGOL.ativar();

        aviaGOL.reservarAssentos(10);

        System.out.printf("GOL (%s) : %d assentos disponíveis%n",
                aviaGOL.isIsativo() ? "Ativo" : "Inativo",
                aviaGOL.calcularAssentosDisponiveis());
    }
}
