package com.fabio.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {

    public static void main(String[] args) {

        // Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
        // Após isso determine o maior número da matriz e a sua posição 
        // (linha, coluna).
        Random numRandom = new Random();

        int[][] numAleatorios = new int[4][4];

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                if (numAleatorios[i][j] > maior) {
                    maior = numAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                System.out.print(numAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }

}
