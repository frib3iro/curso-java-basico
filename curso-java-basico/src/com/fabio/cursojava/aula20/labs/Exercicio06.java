package com.fabio.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Exerc�cio 06");

	int[][] jogoDaVelha = new int[3][3];

	int jogar = 0;
	
	while (jogar == 0) {
	    for (int linha = 0; linha < jogoDaVelha.length; linha++) {
		System.out.println("-");
		for (int coluna = 0; coluna < jogoDaVelha[linha].length; coluna++) {
		    System.out.println("|");
		}
		System.out.println();
	    }
	    System.out.println("Deseja continuar? ");

	    jogar = sc.nextInt();
	}

	sc.close();
    }
}

/*

1 2 3
4 5 6
7 8 9

Fa�a um programa para jogar o jogo da velha. O programa deve permitir que dois 
jogadores fa�am uma partida do jogo da velha, usando o computador para ver o 
tabuleiro. Cada jogador vai alternadamente informando a posi��o onde deseja 
colocar a sua pe�a (?O? ou ?X?). O programa deve impedir jogadas inv�lidas e 
determinar automaticamente quando o jogo terminou e quem foi o vencedor 
(jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situa��o 
do tabuleiro na tela.  
 */
