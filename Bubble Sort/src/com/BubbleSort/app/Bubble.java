package com.BubbleSort.app;

import java.util.Random;

public class Bubble {
	public static void main(String[] args) {
		//creacion de variables
		int[] arregloDesordenado = new int[10];
		int[] arregloOrdenado = new int[10];
		
		int auxiliar = 0;
		
		//creacion de objetos
		Random randomNumber = new Random(System.nanoTime());
		
		//llenamos el vector de numeros aleatorios 
		for(int i=0; i<10; i++) {
			arregloDesordenado[i] = randomNumber.nextInt(11);
			System.out.print(arregloDesordenado[i]+" ");
			
		}
		
		//salto de linea
		System.out.println(" ");
		
		
		//lo ordenamos
		for(int i=0; i<10-1;i++) {
			for(int j=0; j<10-i-1; j++) {
				if(arregloDesordenado[j] > arregloDesordenado[j+1]) {
					
					//swap
					auxiliar = arregloDesordenado[j+1];
					arregloDesordenado[j+1] = arregloDesordenado[j];
					arregloDesordenado[j] = auxiliar;
					
				}
			}
		}
		
		//imprimimos el arreglo ordenado
		for(int i=0; i<10; i++) {
			System.out.print(arregloDesordenado[i]+" ");
		}
		
	}
}
