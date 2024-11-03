package com.fabio.cursojava.aula20;

import java.util.Locale;

public class Matrizes02 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);

	double[][] notasAlunos = new double[3][4];

	notasAlunos[0][0] = 10.0;
	notasAlunos[0][1] = 7.0;
	notasAlunos[0][2] = 8.0;
	notasAlunos[0][3] = 9.5;

	notasAlunos[1][0] = 9.0;
	notasAlunos[1][1] = 8.0;
	notasAlunos[1][2] = 7.0;
	notasAlunos[1][3] = 9.0;

	notasAlunos[2][0] = 8.0;
	notasAlunos[2][1] = 9.0;
	notasAlunos[2][2] = 10.0;
	notasAlunos[2][3] = 7.0;

	for (int i = 0; i < notasAlunos.length; i++) {
	    System.out.print("Notas do aluno " + (i + 1) + ": ");
	    for (int j = 0; j < notasAlunos[i].length; j++) {
		System.out.printf("%5.2f ", notasAlunos[i][j]);
	    }
	    System.out.println();

	}

	System.out.println();
	
	double soma;
	System.out.println("Média de cada aluno: ");
	for (int i = 0; i < notasAlunos.length; i++) {
	    soma = 0;
	    for (int j = 0; j < notasAlunos[i].length; j++) {
		soma += notasAlunos[i][j];
	    }
	    System.out.printf("Média do aluno %d: %5.2f%n", (i + 1), (soma / 4));
	}
	
	System.out.println();
    }
}
