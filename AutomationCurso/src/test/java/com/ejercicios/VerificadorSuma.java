package com.ejercicios;

public class VerificadorSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hasEqualSum(1, 2, 3);

	}

	public static boolean hasEqualSum(int a, int b, int c) {
		if ((a + b) == c) {
			System.out.println("True");
			return true;
		} else {
			System.out.println("False");
			return false;
		}
	}
}
