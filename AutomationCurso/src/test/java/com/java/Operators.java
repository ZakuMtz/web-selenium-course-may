package com.java;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aritmeticos
		
		int x = 6;
		int y = 4;
		int z = x+y;
		
		System.out.println("El valor de la variable z es:" + z);
		 
		z= x-y;
			
		System.out.println("El valor de la variable z es:" + z);
		
		z= x*y;
				
		System.out.println("El valor de la variable z es:" + z);
		
		//Unarios
		
		int A = 1;
		int B = 3;
		
		++A;
		System.out.println("El valor de la variable A es:" + A);
		
		--B;
		System.out.println("El valor de la variable B es:" + B);
		
		
		//Relacionales
		
		if(A == B) {
			System.out.println("Relational Block code");
		}
		
		
		// Condicionales
		
		int Var1 = 5;
		
		int Var2 = 5;
		
		int Var3 = 5;
		
		int Var4 = 5;
		
		if (Var1 == Var2 || Var3 == Var4) {
			
			System.out.println("Conditional Block code");
			
		}
				
	}

}
