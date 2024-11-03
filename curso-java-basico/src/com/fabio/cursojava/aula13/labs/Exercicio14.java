package com.fabio.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Random;

public class Exercicio14 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	
	Random rd = new Random();

	System.out.println("Exercício 14");

	int[] vetorA = new int[10];
	double media = 0;
	int impar = 0;
	int quantidade = 0;

	for (int i = 0; i < vetorA.length; i++) {
	    vetorA[i] = rd.nextInt(10) + 1;
	    if (vetorA[i] % 2 != 0) {
		impar += vetorA[i];
		quantidade++;
	    }
	}

	if (quantidade > 0) {
	    media = (double) impar / quantidade;
	} else {
	    System.out.println("Não há números ímpares!");
	}

	System.out.print("Vetor A: ");
	for (int a : vetorA) {
	    System.out.printf("%2d ", a);
	}

	System.out.println();

	System.out.printf("Média: %.2f", media);

	System.out.println();

    }

}

/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa que escreva 
a média aritmética simples dos elementos ímpares armazenados neste vetor.    
 */
