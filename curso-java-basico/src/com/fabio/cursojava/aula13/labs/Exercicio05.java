package com.fabio.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Exercício 05");

	int[] vetorA = new int[7];
	int[] vetorB = new int[vetorA.length];

	System.out.println("Digite os valores do vetor A: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = sc.nextInt();
	    vetorB[i] = vetorA[i] * i;
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

	sc.close();
    }

}

/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e 
tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de 
A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.   
*/
