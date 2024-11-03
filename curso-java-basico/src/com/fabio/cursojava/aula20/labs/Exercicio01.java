package com.fabio.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio01 {

    public static void main(String[] args) {

	System.out.println("Exercício 01");
	
	Random rd = new Random();

	int[][] matriz = new int[4][4];

	int maior = 0;
	int lin = 0;
	int col = 0;
	
	for (int linha = 0; linha < matriz.length; linha++) {
	    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
		matriz[linha][coluna] = rd.nextInt(10);
		if (maior <= matriz[linha][coluna]) {
		    maior = matriz[linha][coluna];
		    lin = linha;
		    col = coluna;
		}
	    }
	}

	System.out.println();

	System.out.println("Matriz 4x4: ");

	for (int linha = 0; linha < matriz.length; linha++) { // percorre as linhas
	    for (int coluna = 0; coluna < matriz[linha].length; coluna++) { // percorre as colunas
		System.out.printf("%2d ", matriz[linha][coluna]);
	    }
	    System.out.println(); // quebra de linha após cada linha
	}

	System.out.println();
	
	System.out.println("Tamanho matriz: " + matriz.length);
	System.out.println("Maior número: " + maior);
	System.out.println("Linha:  " + lin);
	System.out.println("Coluna: " + col);

    }
}

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9. 
Após isso determine o maior número da matriz e a sua posição (linha, coluna). 
 */
