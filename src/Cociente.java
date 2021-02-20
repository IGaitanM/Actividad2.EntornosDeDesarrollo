/**
 * Clase para realizar operaciones de cocientes. (Los resultados que den n�meros reales peri�dicos solo devolver�n 16 decimales.)
 * 
 * @author Miguel Vilanova - Equipocucudrulu
 * @since 24/01/2021
 * @version 1.0
 * 
 */

public class Cociente {
	/**
	 * M�todo para dividir dos n�meros reales.
	 * 
	 * @param numReal1 primer valor real para hacer la operaci�n.
	 * @param numReal2 segundo valor real para hacer la operaci�n que sea diferente a 0.

	 * @return resultado devuelve la divisi�n de los dos valores reales. 
	 */
	public double dividirDosReales(double numReal1, double numReal2) {

	double resultado = numReal1 / numReal2;
			return resultado ;
	}
	/**
	 * M�todo para dividir dos n�meros enteros.
	 * 
	 * @param numEnt1 primer valor entero para hacer la operaci�n.
	 * @param numEnt2 segundo valor entero para hacer la operaci�n que sea diferente a 0.
	 * @return resultado devuelve la divisi�n de los dos valores enteros. (El resultado de la operaci�n es redondeado a un entero).
	 */
	public int dividirDosEnteros(int numEnt1, int numEnt2) {

	int resultado = numEnt1 / numEnt2;
		return resultado ;
	}
	
}
