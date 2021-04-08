package com.fabio.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {
        /*
         * Faça um programa para a leitura de duas notas parciais de um aluno.
         * O programa deve calcular a média alcançada por aluno e apresentar:
         * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
         * A mensagem "Reprovado", se a média for menor do que sete;
         * A mensagem "Aprovado com Distinção", se a média for igual a dez.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        
        if (nota1 < 0 || nota1 > 10.0 || nota2 < 0 || nota2 > 10.0) {
            System.out.println("A nota deve estar entre 0 e 10");
        } else if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media < 7.0) {
            System.out.println("Reprovado");
        } else if (media == 10.0) {
            System.out.println("Aprovado com distinção");
        }

        scan.close();
    }
}
