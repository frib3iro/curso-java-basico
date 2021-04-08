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
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o numero " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = (int) Math.sqrt(vetorA[i]);
        }
        scan.close();
    }
}
