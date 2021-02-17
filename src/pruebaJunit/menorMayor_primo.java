package pruebaJunit;

import java.util.ArrayList;
import java.util.List;

public class menorMayor_primo {
	
	/**
	 * Método para establecer primos de un número
	 * @param num
	 * @return
	 */

	public static int [] primos (int num) {
		
		//boolean esPrimo; //Creamos boolean para comprobar si se trata de un número primo
		List<Integer> listaPrimos = new ArrayList<Integer>();
		int arrayPrimos [] = new int [3];
		
		// Recorro el array, comprobando si cada elemento es un número primo
				for (int i = 1; i <= num; i++) {
					//if (i == 3) {
						//listaPrimos.add(i);
					//}
					boolean esPrimo = true; // Utilizo una bandera, asumiendo que el número es primo
					// En el bucle siguiente intento demostrar que hay algún divisor del número.
					for (int j = 2; j < i - 1; j++) {
						if (i % j == 0) { // j es divisor de numeros[i]
							esPrimo = false; // Bajo la bandera, no hay primo
						}
					}
					// Si salimos del bucle con la bandera arriba, el número es primo
					if (esPrimo == true) {
						listaPrimos.add(i);
					}
				}
				//}
		for (int i  = 0; i < arrayPrimos.length; i++) {
			arrayPrimos[i] = listaPrimos.get(listaPrimos.size()-(1+i));
			
		}
		
		return arrayPrimos;
	}
	
	
	

	/**
	 * 
	 * @param array
	 */
	public static int [] menorMayor (int array[]) {

			
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);

		return array;
	}
	
}
