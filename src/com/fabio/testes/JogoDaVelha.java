package com.fabio.testes;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        // Imprimir o tabuleiro
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
        
        
        scan.close();
    }
}
