package com.java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//ARREGLO UNIDIMENSIONAL//
		
		String[] nombres = {"Ricardo","Jessica","Aide","Felipe", "Luis","Sandra","Carlos"};
//		System.out.println("El nombre de la persona:"+ nombres[3]);	
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("El nombre de la persona:"+ nombres[i]);		
		}
    //ARREGLO BIDIMINSIONAL//
		String[][] nombreEdad = new String[4][2];
		
		nombreEdad [0][0]= "Ricardo";
		nombreEdad [0][1]= "30";
		nombreEdad [1][0]= "Jessica";
		nombreEdad [1][1]= "31";
		nombreEdad [2][0]= "Aide";
		nombreEdad [2][1]= "32";
		nombreEdad [3][0]= "Felipe";
		nombreEdad [3][1]= "33";
		
		//System.out.println("El nombre de la persona:"+ nombreEdad[0][0] + " y su edad es" + nombreEdad[0][1]);
		
		printNombreEdad(nombreEdad[0][0],nombreEdad[0][1]); 
		
		int z = suma(2,2);
		System.out.println(z);

	}
	
	public static void printNombreEdad(String nombre, String edad) {
		System.out.println("Metodo: El nombre de la persona: "+ nombre + " y su edad es " + edad);
	}
	
	public static int suma(int x, int y) {
		return x+y;
	}

}
