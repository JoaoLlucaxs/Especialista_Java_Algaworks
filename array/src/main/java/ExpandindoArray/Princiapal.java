package ExpandindoArray;

import java.util.Arrays;

public class Princiapal {
    public static void main(String[] args) {

        // Não há como tornar um array dinâmico , será feito uma gambiarra para aumentar
        int[] numerosJogo1 = {25 , 11 , 8 ,46 ,37 ,14};

        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1 , numerosJogo1.length + 1); // + 1 aumentando espaço

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));
    }
}
