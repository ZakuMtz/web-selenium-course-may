package com.java;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 10; //Km/H
		int limitevelocidad = 100; 
		
		//IF & IF-ELSE
//		
//		if (velocidad > limitevelocidad) {
//			
//			System.out.println("MULTA");
//		} else {
//			System.out.println("El coche va en la velocidad adecuada");
//		}

		// IF ANIDADO
		
		boolean highway = true;
		
		if (highway) {
			System.out.println("Estamos en un highway");
			
			limitevelocidad = 120;
			
//			if (velocidad > limitevelocidad) {
//				System.out.println("MULTA");
//			} else {
//				System.out.println("El coche va en la velocidad adecuada");
//			}
		}else if (velocidad > limitevelocidad) {
			System.out.println("El coche va en una calle y va a exceso de velocidad, Multa!");
		} else {
			System.out.println("El coche va en una calle y va a una velocidad permitida");
		}
		
//		//switch case//
//		
//		int Temperatura = 23;
//		
//		switch (Temperatura) {
//		case 5: 
//			System.out.println("Mucho frio");
//			break;
//			
//		case 10: 
//			System.out.println("Frio");
//			break;	
//			
//		case 20:
//		case 25:	
//			System.out.println("Templado");
//			break;
//			
//		case 35: 
//			System.out.println("Mucho calor");
//			break;
//			
//		default:
//			System.out.println("No encontro relacion de temperatura");
//			break;
			
//		}
		
		
	}	

}
