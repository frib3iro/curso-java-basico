package com.fabio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        // mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
        // raiz quadrada do respectivo elemento de A, ou seja:
        // B[i] = sqrt(A[i]).
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o numero " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}
