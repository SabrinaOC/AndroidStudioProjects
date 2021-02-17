
package arrays;
		
public class invertir_array {
		public invertir_array() {
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaramos array a invertir y la variable que nos va a servir para
		//intercambiar los valores del array
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux=0;
		// imprimimos array para comprobar
		/*Inicio mod 26/11/20 se ha eliminado la variable longitud porque no era necesaria y daba fallo al recorrer el array.
		 * Reemplazamos <= por < */
		for (int i = 0; i<=array.length; i++)
		 System.out.print(array[i] + " ");
		// invertimos array recorriéndolo hasta la mitad e intercambiando valores
		for(int i=0;i<=array.length/2; i++){
		//vamos guardando la posición que vamos a intercambiar desde el final
		 aux = array[array.length-i-1]; /*Inicio de modificación, para que no se salga del límite se recorre hasta una posición menos*/
		 //como ya tenemos guardada la posición longiutd-i-1, ya podemos guardar en
		//esa posición un valor
		 array[array.length-i-1] = array[i];
		 //guardamos en las posiciones iniciales el valor de aux que ya estaba
		//guardado
		 array[i] = aux;
		 }
		// comprobamos que se ha invertido el array
		System.out.println();
		for (int i = 0; i < array.length; i++)
		 System.out.print(array[i] + " ");
		}
		}

