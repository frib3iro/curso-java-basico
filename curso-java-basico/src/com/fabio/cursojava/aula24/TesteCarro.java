package com.fabio.cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args) {

	Carro van = new Carro();

	van.marca = "Fiat";
	van.modelo = "Ducato";
	van.numPassageiros = 10;
	van.capCombustivel = 100;
	van.conCombustivel = 0.2;

	System.out.println(van.marca);
	System.out.println(van.modelo);
	
	System.out.println();

	van.marca = "Fusca";
	van.modelo = "Volkswagen";
	van.numPassageiros = 4;
	van.capCombustivel = 30;
	van.conCombustivel = 0.15;

	System.out.println(van.marca);
	System.out.println(van.modelo);

    }

}
