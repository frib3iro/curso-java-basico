package com.fabio.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        // Faça um programa para jogar o jogo da velha. O programa deve
        // permitir que dois jogadores façam uma partida do jogo da velha,
        // usando o computador para ver o tabuleiro. Cada jogador vai
        // alternadamente informando a posição onde deseja colocar a sua
        // peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
        // determinar automaticamente quando o jogo terminou e quem foi o
        // vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
        // deve atualizar a situação do tabuleiro na tela.
        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = x");
        System.out.println("Jogador 2 = o");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;

        while (!ganhou) {
            if (jogada % 2 == 1) { // jogador 1
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'x';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'o';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.print("Entre com a linha (1, 2 ou 3): ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente!");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.print("Entre com a coluna (1, 2 ou 3): ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente!");
                }
            }

            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
                System.out.println("Posição já usada, tente novamente!");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            // Imprimir o tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }
            // Verifica se tem um ganhador
            if ((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x') // linha1
                    || (jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[1][2] == 'x') // linha2
                    || (jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x') // linha3
                    || (jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x') // coluna1
                    || (jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x') // coluna2
                    || (jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][2] == 'x') // coluna3
                    || (jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x')) {  // diagonal
                ganhou = true;
                System.out.println("Parabens, jogador 1 ganhou!");
            } else if ((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o') // linha1
                    || (jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[1][2] == 'o') // linha2
                    || (jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'o') // linha3
                    || (jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'o') // coluna1
                    || (jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'o') // coluna2
                    || (jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][2] == 'o') // coluna3
                    || (jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o')) {  // diagonal
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("ninguém ganhou essa partida!");
            }

        }

        scan.close();

    }
}
