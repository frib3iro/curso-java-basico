package com.fabio.cursojava.aula13.labs;

import java.util.Random;

public class Exercicio13 {

    public static void main(String[] args) {

	Random rd = new Random();

	System.out.println("Exercício 13");

	int[] vetorA = new int[10];
	int soma = 0;

	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(10) + 1;
	    if (vetorA[i] % 5 == 0) {
		soma += vetorA[i];
	    }
	}

	System.out.print("Vetor A: ");
	for (int a : vetorA) {
	    System.out.printf("%2d ", a);
	}

	System.out.println();

	System.out.print("Soma: " + soma);

	System.out.println();

    }

}

/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.   
 */
