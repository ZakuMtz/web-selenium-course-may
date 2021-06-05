package com.java;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 10; //Km/H
		int limitevelocidad = 100; 
		
//		if (velocidad > limitevelocidad) {
//			
//			System.out.println("MULTA");
//		} else {
//			System.out.println("El coche va en la velocidad adecuada");
//		}

		// IF ANIDADO
		
		boolean highway = false;
		
		if (highway) {
			System.out.println("Estamos en un highway");
			
			limitevelocidad = 120;
			
			if (velocidad > limitevelocidad) {
				System.out.println("MULTA");
			} else {
				System.out.println("El coche va en la velocidad adecuada");
			}
		}else if (velocidad > limitevelocidad) {
			System.out.println("El coche va en una calle y va a exceso de velocidad, Multa!");
		} else {
			System.out.println("El coche va en una calle y va a una velocidad permitida");
		}
	}

}
