package com.lineadecodigo.java.basico.arrays;

/**
 * @file NumeroMayorPosicion.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   3-marzo-2009
 * @url    http://lineadecodigo.com/2009/03/03/numero-mayor-y-su-posicion/
 * @description Conocer el n�mero mayor de un array y la posici�n en la que se encuentra.
 */

public class NumeroMayorPosicion {

	public static void main(String[] args) {

		int[] listaNumeros = {1,4,7,8,9,2,7,15,4,6,9,8};
		int iNumeroMayor, iPosicion;
	   
		//Presuponemos que el numero mayor es el primero
		iNumeroMayor = listaNumeros[0];
		iPosicion = 0;
	   
	   
		//Recorremos los demas para ver si hay alguno mayor
	   //En tal caso sustituiremos el numeroMayor por el nuevo valor
	   //Y la variable posicion por el numero del elemento del array
	   //en el que estemos
	   
	   for (int x=1;x<listaNumeros.length;x++){
	   
	     if (listaNumeros[x]>iNumeroMayor){
	       iNumeroMayor = listaNumeros[x];
	       iPosicion = x;
	     } 
	   } 
	   
	   System.out.println("El n�mero mayor encontrado es " + iNumeroMayor);
	   System.out.println("Y se encuentra en la posici�n " + iPosicion);
		
		

	}

}
