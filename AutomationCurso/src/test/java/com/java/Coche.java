package com.java;

public class Coche {
	
	public String llantas;
	public String marca;
	
	//Constructor
//	
//	public Coche(String llantas, String marca) {
//		this.llantas = llantas;
//		this.marca = marca;
//		}
	
		// Overloading // Sobrecarga de metodos//
		public int Operador(int x, int y) {
			return x+y;
		}
			
		public int Operador(int x, int y, int z) {
				return x+y+z;
		}		
		
		public int Operador(int x, int y, int z, int a) {
					return x+y+z+a;	
		}
		
		public  int Operador(boolean b){
		return 1+1;
		
		
		}
		
		public int Operador(int c) {
			switch (c) {
			
			case 1:
			return 1+1;
			
			case 2:
			return 2+2;
		
			}
			
			return 3+3;
					
		
	}
	
}
