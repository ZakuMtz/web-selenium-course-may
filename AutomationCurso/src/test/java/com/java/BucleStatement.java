package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While//
		
	int numero = 1;
	while (numero <= 10) {
		
		//BLOCKCODE
		System.out.println("El numero es:"+numero);
		++ numero;
	}
	
	//Do while//
	//Cuantas veces se tiene que sumar un numero para llegar a 100//
	
	int NumeroLimite = 2;
	int sumTotal = 0;
	int count = 0;
		
		do {
			sumTotal =sumTotal + NumeroLimite;
		++count;
		
		} while (sumTotal < 100);
		System.out.println("El numero se sumo:"+count);
		
	// For case//
		
		int numeroFor = 10;
		
		for (int i = 1; i <= numeroFor; i++) {
			System.out.println("El numero for es:"+ i);	
		}

	}

}
