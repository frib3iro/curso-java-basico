package com.fabio.cursojava.labs13;

import java.util.Random;

public class Exercicio02 {
    
    public static void main(String[] args) {
	
	Random rd = new Random();
	
	System.out.println("Hello world!");
	
	int[] vetorA = new int[8];
	int[] vetorB = new int[vetorA.length];
	
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(10) + 1;
	    vetorB[i] = vetorA[i] * 2;
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
    }
    
}


/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e 
tamanho e com os elementos do vetor A multiplicados por 2, 
ou seja: B[i] = A[i] * 2.  
*/