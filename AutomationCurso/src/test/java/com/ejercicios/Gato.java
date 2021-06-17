package com.ejercicios;

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
isCatPlaying(false,10);
		
	}

	public static void isCatPlaying(boolean verano, int temperatura) {
		System.out.println("" + verano+ " , " + temperatura);
		if (verano) {
			if (temperatura >= 25 && temperatura <= 45) {
				System.out.println("Verdadero");
			} else {
				System.out.println("Falso");
			}

		} else {

			if (temperatura >= 25 && temperatura <= 35) {
				System.out.println("Verdadero");
			} else {
				System.out.println("Falso");
			}

		}
	}

}
