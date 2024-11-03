package com.fabio.cursojava.aula13.labs;

import java.util.Random;

public class Exercicio01 {

    public static void main(String[] args) {

	Random rd = new Random();

	System.out.println("Exercício 01");

	int[] vetorA = new int[5];
	int[] vetorB = new int[vetorA.length];

	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(10) + 1;
	    vetorB[i] = vetorA[i];
	}

	System.out.print("Vetor A:");
	for (int a : vetorA) {
	    System.out.printf("%2d ", a);
	}

	System.out.println();

	System.out.print("Vetor B:");
	for (int b : vetorB) {
	    System.out.printf("%2d ", b);
	}

	System.out.println();
    }

}

/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e 
tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]. 
*/
