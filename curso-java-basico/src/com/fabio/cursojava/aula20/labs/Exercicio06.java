package com.fabio.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Jogador 1 = X");
	System.out.println("Jogador 2 = O");

	// Define uma matriz para o tabuleiro
	char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	boolean ganhou = false;
	int jogada = 1;
	int linhaTabuleiro = 0;
	int colunaTabuleiro = 0;
	char sinal;

	while (!ganhou) {

	    if (jogada % 2 == 1) {
		System.out.println("Vez do jogador 1, escolha linha e columa (1 - 3)");
		sinal = 'X';
	    } else {
		System.out.println("Vez do jogador 2, escolha linha e columa (1 - 3)");
		sinal = 'O';
	    }

	    boolean linhaValida = false;
	    while (!linhaValida) {
		System.out.println("Entre com a linha (1, 2 ou 3)");
		linhaTabuleiro = sc.nextInt();
		if (linhaTabuleiro >= 1 && linhaTabuleiro <= 3) {
		    linhaValida = true;
		} else {
		    System.out.println("Entrada inválida! Tente novamente.");
		}
	    }

	    boolean colunaValida = false;
	    while (!colunaValida) {
		System.out.println("Entre com a coluna (1, 2 ou 3)");
		colunaTabuleiro = sc.nextInt();
		if (colunaTabuleiro >= 1 && colunaTabuleiro <= 3) {
		    colunaValida = true;
		} else {
		    System.out.println("Entrada inválida! Tente novamente.");
		}
	    }

	    linhaTabuleiro--;
	    colunaTabuleiro--;
	    if (tabuleiro[linhaTabuleiro][colunaTabuleiro] == 'X' || tabuleiro[linhaTabuleiro][colunaTabuleiro] == 'O') {
		System.out.println("Posição já utilizada! tente novamente.");
	    } else {
		tabuleiro[linhaTabuleiro][colunaTabuleiro] = sinal;
		jogada++;
	    }

	    // impressão do tabuleiro
	    for (int linha = 0; linha < tabuleiro.length; linha++) {
		for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
		    System.out.print(" " + tabuleiro[linha][coluna]);
		    if (coluna < 2) {
			System.out.print(" |");
		    }
		}
		System.out.println();
		if (linha < 2) {
		    System.out.println("---+---+---");
		}
	    }

	    // Verifica se ouve um ganhador
	    // Verifica se houve um ganhador
	    if ((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) // linha 1
		    || (tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) // linha 2
		    || (tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) // linha 3
		    || (tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) // coluna 1
		    || (tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) // coluna 2
		    || (tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) // coluna 3
		    || (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) // diagonal principal
		    || (tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal)) { // diagonal secundária

		ganhou = true;
		System.out.println("Parabéns, jogador " + (sinal == 'X' ? "1" : "2") + " ganhou!");
	    } else if (jogada > 9) {
		ganhou = true;
		System.out.println("Empate!");
	    }

	}

	sc.close();
    }
}


/*
Faça um programa para jogar o jogo da velha. O programa deve permitir que dois 
jogadores façam uma partida do jogo da velha, usando o computador para ver o 
tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja 
colocar a sua peça (O ou X). O programa deve impedir jogadas inválidas e 
determinar automaticamente quando o jogo terminou e quem foi o vencedor 
(jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação 
do tabuleiro na tela.  
 */
