package miCalculadora;




/**
 * Clase para realizar la resta de los números dados a través de sus métodos o
 * consola 
 * 
 * @author tanis
 *
 */
public class Resta {
	

	/**
	 * Números de tipo real que serán utilizados cuando el método lo requiera
	 */
	double num1, num2, num3;
	/**
	 * Número de tipo real que almacenará el resultado de las operaciones
	 */
	public static double resultado;
	/**
	 * Números de tipo entero que serán utilizados cuando el método lo requiera
	 */
	int numer1, numer2, numer3;
	/**
	 * Número de tipo entero que almacenará el resultado de las operaciones
	 */
	public static int resultadoent;

	/**
	 * Método que resta dos números reales introducidos por consola
	 * 
	 * @param num1 Primer operando
	 * @param num2 Segundo operando
	 * @return Devuelve la diferencia de los números introducidos
	 */

	public static double resta(double num1, double num2) {

		resultado = num1 - num2;
	
		
		return resultado;
	}

	/**
	 * Método que resta dos números enteros introducidos por consola
	 * 
	 * @param numer1 Primer operando
	 * @param numer2 Primer operando
	 * @return Devuelve la diferencia de los números introducidos
	 */
	public static int resta(int numer1, int numer2) {
		resultadoent = numer1 - numer2;
		return resultadoent;
	}

	/**
	 * Método que resta un número real al resultado de la resta de otros dos. Los tres introducidos por consola
	 * 
	 * @param num1 Primer operando
	 * @param num2 Segundo operando
	 * @param num3 Tercer operando
	 * @return Devuelve la diferencia de los dos primeros operandos, y de este resultado con el tercer operando
	 */
	public static double resta(double num1, double num2, double num3) {
		resultado = (num1 - num2) - num3;
		return resultado;
	}

	/**
		 * Método que resta un número introducido por consola al resultado de la operación anterior
		 * @param num1 Primer Operando
		 * @return Devuelve la diferencia entre el resultado de la última operación almacenada y el operando introducido como parámetro
		 */
		public static double resta(double num1) {
		Resta.resultado-=num1;
			return resultado;
		
	}

	

	
}
