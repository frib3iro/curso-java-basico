package com.fabio.testes;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        // Imprimir o tabuleiro
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
