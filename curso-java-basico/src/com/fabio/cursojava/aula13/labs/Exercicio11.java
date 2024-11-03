package com.fabio.cursojava.aula13.labs;

import java.util.Random;

public class Exercicio11 {

    public static void main(String[] args) {

	Random rd = new Random();

	System.out.println("Exercício 11");

	int[] vetorA = new int[10];

	System.out.println("Gerando os valores do vetor A: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(30) + 1;
	}

	System.out.print("Vetor A: ");
	for (int a : vetorA) {
	    System.out.printf("%2d ", a);
	}

	System.out.println();

	System.out.print("Números pares: ");
	for (int i = 0; i < vetorA.length; i++) {
	    if (vetorA[i] % 2 == 0) {
		System.out.printf("%2d ", vetorA[i]);
	    }
	}
	
	System.out.println();

    }

}

/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e 
escreva a quantidade de elementos armazenados neste vetor que são pares.   
 */
