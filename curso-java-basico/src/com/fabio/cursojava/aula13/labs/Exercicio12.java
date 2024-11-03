package com.fabio.cursojava.aula13.labs;

import java.util.Random;

public class Exercicio12 {

    public static void main(String[] args) {
	
	Random rd = new Random();
	
	System.out.println("Exercício 12");

	int[] vetorA = new int[10];
	int soma = 0;
	
	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(10) + 1;
	    soma += vetorA[i];
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
Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e 
escreva a soma de todos os elementos armazenados neste vetor.   
*/
