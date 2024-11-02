package com.fabio.cursojava.labs13;

import java.util.Random;

public class Exercicio04 {
    
    public static void main(String[] args) {
	
	Random rd = new Random();
	
	System.out.println("Hello world!");
	
	int[] vetorA = new int[15];
	int[] vetorB = new int[vetorA.length];
	
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(10) + 1;
	    vetorB[i] = (int) Math.sqrt(vetorA[i]);
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
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do 
respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).    
*/