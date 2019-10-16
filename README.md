# Bubble-Sort

La Ordenación de burbuja (Bubble Sort en inglés) es un sencillo algoritmo de ordenamiento. Funciona revisando cada elemento de la lista que va a ser ordenada con el siguiente, intercambiándolos de posición si están en el orden equivocado. 

Es necesario revisar varias veces toda la lista hasta que no se necesiten más intercambios, lo cual significa que la lista está ordenada. Este algoritmo obtiene su nombre de la forma con la que suben por la lista los elementos durante los intercambios, como si fueran pequeñas "burbujas". 


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
    
### Ejercicios

1. Hacer un programa en Java que llene un arreglo de longitud 10 de numeros pseudo-aleatorios y despues 
   ordene los elementos de menor a mayor.
   
   [codigo aqui](https://github.com/UrielMendozaG/Bubble-Sort/blob/master/Bubble%20Sort/src/com/BubbleSort/app/Bubble.java)
