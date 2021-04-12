package com.fabio.cursojava.aula20;

public class Matriz3d {

    public static void main(String[] args) {

        int[][][] matriz3d = new int[3][3][3];

        for (int i = 0; i < matriz3d.length; i++) {
            for (int j = 0; j < matriz3d[i].length; j++) {
                for (int k = 0; k < matriz3d[i][j].length; k++) {
                    matriz3d[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaimpares = 0;

        for (int i = 0; i < matriz3d.length; i++) {
            for (int j = 0; j < matriz3d[i].length; j++) {
                for (int k = 0; k < matriz3d[i][j].length; k++) {
                    soma += matriz3d[i][j][k];

                    if (matriz3d[i][j][k] % 2 == 0) {
                        somaPares += matriz3d[i][j][k];
                    } else {
                        somaimpares += matriz3d[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total: " + soma);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos impares: " + somaimpares);
    }
}
