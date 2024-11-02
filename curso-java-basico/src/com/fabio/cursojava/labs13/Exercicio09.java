package com.fabio.cursojava.labs13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Exercício 09");

	int[] vetorA = new int[10];
	int[] vetorB = new int[vetorA.length];
	float[] vetorC = new float[vetorA.length];

	System.out.println("Digite os valores do vetor A: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = sc.nextInt();
	}

	System.out.println("Digite os valores do vetor B: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorB[i] = sc.nextInt();
	}

	for (int i = 0; i < vetorA.length; i++) {
	    vetorC[i] = vetorA[i] / (float) vetorB[i];
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
	for (float c : vetorC) {
	    System.out.printf("%.2f ", c);
	}

	System.out.println();

	sc.close();
    }

}

/*
Criar dois vetores A e B cada um com 10 elementos inteiros. 
Construir um vetor C, onde cada elemento de C é a divisão dos respectivos 
elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).   
*/
