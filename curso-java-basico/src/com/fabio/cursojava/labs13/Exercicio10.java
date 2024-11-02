package com.fabio.cursojava.labs13;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Exerc�cio 10");

	int[] vetorA = new int[10];
	int[] vetorB = new int[vetorA.length];

	System.out.println("Digite os valores do vetor A: ");
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = sc.nextInt();
	    vetorB[i] = vetorA[i] % 2;
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
tamanho, sendo que cada elemento do vetor B dever� ser o resto da divis�o do 
respectivo elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2.   
*/
