package com.fabio.cursojava.labs13;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Exercício 07");

	int[] vetorA = new int[10];
	int[] vetorB = new int[vetorA.length];
	int[] vetorC = new int[vetorA.length];

	System.out.println("Digite os valores do vetor A: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = sc.nextInt();
	}

	System.out.println("Digite os valores do vetor B: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorB[i] = sc.nextInt();
	}

	for (int i = 0; i < vetorA.length; i++) {
	    vetorC[i] = vetorA[i] - vetorB[i];
	}

	System.out.print("Vetor A: ");
	for (int a : vetorA) {
	    System.out.printf("%2d ", a);
	}

	System.out.println();

	System.out.print("Vetor B: ");
	for (int b : vetorB) {
	    System.out.printf("%2d ", b);
	}

	System.out.println();

	System.out.print("Vetor C: ");
	for (int c : vetorC) {
	    System.out.printf("%2d ", c);
	}

	System.out.println();

	sc.close();
    }

}

/*
Criar dois vetores A e B cada um com 10 elementos inteiros. 
Construir um vetor C, onde cada elemento de C é a subtração dos respectivos 
elementos em A e B, ou seja: C[i] = A[i] ? B[i]. 
*/
