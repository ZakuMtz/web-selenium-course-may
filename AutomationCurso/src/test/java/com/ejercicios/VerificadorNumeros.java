package com.ejercicios;

public class VerificadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		imprimirVerificadorNumeros(4, 4, 4);

	}

	public static void imprimirVerificadorNumeros(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Valor no valido");
		} else if (a == b && a == c) {
			System.out.println("Todos los números son iguales");
		} else if (a != b && a != c && b!=c) {
			System.out.println("Todos son diferentes");
		} else {
			System.out.println("Ni todos los números son iguales, ni todos son diferentes");
		}
	}

}
