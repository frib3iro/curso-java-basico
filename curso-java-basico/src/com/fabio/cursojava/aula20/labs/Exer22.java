package com.fabio.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer22 {

    public static void main(String[] args) {

        // Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
        // 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
        // para implementar um programa que determine o percentual de
        // números 0's e 1's existentes no vetor A.
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        double porcentagem0 = (qtd0 * 100) / vetorA.length;
        double porcentagem1 = (qtd1 * 100) / vetorA.length;

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Pporcentagem 0 = " + porcentagem0);
        System.out.println("Pporcentagem 1 = " + porcentagem1);
        scan.close();
    }
}
