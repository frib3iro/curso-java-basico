package com.fabio.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio02 {

    public static void main(String[] args) {

	System.out.println("Exercício 02");
	
	Random rd = new Random();

	int[][] matriz = new int[10][10];

	int maiorValorLinha = Integer.MIN_VALUE;  // Para encontrar o maior valor
	int menorValorLinha = Integer.MAX_VALUE;   // Para encontrar o menor valor
	int maiorValorColuna = Integer.MIN_VALUE;  // Para encontrar o maior valor
	int menorValorColuna = Integer.MAX_VALUE;   // Para encontrar o menor valor

	for (int linha = 0; linha < matriz.length; linha++) {
	    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
		matriz[linha][coluna] = rd.nextInt(10) + 1;

		// Verifica valores da linha 5
		if (linha == 5) {
		    if (maiorValorLinha < matriz[linha][coluna]) {
			maiorValorLinha = matriz[linha][coluna];
		    }
		    if (menorValorLinha > matriz[linha][coluna]) {
			menorValorLinha = matriz[linha][coluna];
		    }
		}

		// Verifica valores da coluna 7
		if (coluna == 7) {
		    if (maiorValorColuna < matriz[linha][coluna]) {
			maiorValorColuna = matriz[linha][coluna];
		    }
		    if (menorValorColuna > matriz[linha][coluna]) {
			menorValorColuna = matriz[linha][coluna];
		    }
		}
	    }
	}

	System.out.println("Matriz 10x10: ");

	for (int linha = 0; linha < matriz.length; linha++) {
	    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
		System.out.printf("%2d ", matriz[linha][coluna]);
	    }
	    System.out.println();
	}

	System.out.println();

	System.out.println("Maior valor da linha 5:  " + maiorValorLinha);
	System.out.println("Menor valor da linha 5:  " + menorValorLinha);
	System.out.println("Maior valor da coluna 7: " + maiorValorColuna);
	System.out.println("Menor valor da coluna 7: " + menorValorColuna);

	System.out.println();
    }
}

/*
Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. 
Após isso indique: 
qual é o maior e o menor valor da linha 5
qual é o maior e o menor valor da coluna 7. 
 */
