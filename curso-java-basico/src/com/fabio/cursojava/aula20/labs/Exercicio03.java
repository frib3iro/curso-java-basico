package com.fabio.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio03 {

    public static void main(String[] args) {

	System.out.println("Exercício 03");
	
	Random rd = new Random();

	int[][] matriz = new int[3][3];
	int pares = 0;
	int impares = 0;

	for (int linha = 0; linha < matriz.length; linha++) {
	    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
		matriz[linha][coluna] = rd.nextInt(10) + 1;
		if (matriz[linha][coluna] % 2 == 0) {
		    pares++;
		} else {
		    impares++;
		}
	    }
	}

	System.out.println("Matriz 3x3: ");

	for (int linha = 0; linha < matriz.length; linha++) {
	    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
		System.out.printf("%2d ", matriz[linha][coluna]);
	    }
	    System.out.println();
	}
	
	System.out.println();
	
	System.out.println("Números pares:   " + pares);
	System.out.println("Números impares: " + impares);

	System.out.println();
    }
}

/*
Capture do teclado valores para preenchimento de uma matriz M 3x3. 
Após a captura imprima a matriz criada e encontre a quantidade de números pares, 
a quantidade de números ímpares.
*/
