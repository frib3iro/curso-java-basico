package com.fabio.cursojava.aula20;

import java.util.Scanner;

public class Matrizes04 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Digite o número de pessoas entrevistadas: ");
	int numEntrevistados = sc.nextInt();

	String[][] nomesFilhos = new String[numEntrevistados][];

	for (int i = 0; i < nomesFilhos.length; i++) {
	    System.out.print("Quantidade de filhos: ");
	    int quantidadeFilhos = sc.nextInt();
	    nomesFilhos[i] = new String[quantidadeFilhos];
	    for (int j = 0; j < nomesFilhos[i].length; j++) {
		System.out.print("Digite o nome do filho " + (j + 1) + ": ");
		nomesFilhos[i][j] = sc.next();
	    }
	}

	for (int i = 0; i < nomesFilhos.length; i++) {
	    System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos");
	    for (int j = 0; j < nomesFilhos[i].length; j++) {
		System.out.println(nomesFilhos[i][j]);
	    }
	}
	System.out.println();

	sc.close();
    }
}
