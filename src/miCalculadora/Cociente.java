package miCalculadora;


/**
 * Clase que permite calcular el cociente entre números introducidos como parámetros
 * En el caso de que el dividendo sea 0, el resultado será siempre 0.
 * Si el divisor es 0, lanzará la excepción DivByZeroException
 * El resultado, aunque los operandos sean números enteros será siempre de tipo double, con el fin de reflejar las divisiones no exactas.
 * @author tanis
 *
 */
public class Cociente {
	/**
	 * Números de tipo real que serán los operandos de los métodos correspondientes
	 */
	double ope1, ope2,ope3;
	
	/**
	 * Número real. Guardará el resultado de los métodos correspondientes
	 */
	static double result;
	/**
	 * Números de tipo entero que serán los operandos de los métodos correspondientes
	 */
	int oper1, oper2, oper3;
	
	/**
	 * Número entero. Guardará el resultado de los métodos correspondientes
	 */
	int resultado;
	/**
	 * Método que divide los dos números reales introducidos como parámetros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @return Devuelve un número real que es el resultado de la multiplicación de los dos números introducidos como parámetros
	 */
	
	public static double cociente(double ope1, double ope2) {
		result = (double)ope1/ope2;
		return result;
		
	}
	/**
	 * Método que divide dos números enteros introducidos como parámetros
	 * @param suman1 Primer operando
	 * @param suman2 Segundo operando
	 * @return Devuelve un número real que es el resultado de la división de los dos números introducidos como parámetros
	 */
	public static double cocienteint(int oper1, int oper2) {
		result = (double)oper1*oper2;
		return result;
		
	}
	/**
	 * Método que divide la unidad por otro número introducido como parámetro
	 * @param ope1 Primer operando
	 * @return Devuelve un número real, inverso del introducido por parámetro
	 */
	public static double inverso(double ope1) {
		result = (double)1/ope1;
		return result;
		
	}
	/**
	 * Método que devuelve la raiz cuadrada del número introducido como parámetro
	 * @param ope1 Operando introducido como parámetro
	 * @return Devuelve un número real es la raiz cuadrade del parámetro introducido
	 */
	
	public static double raiz(double ope1) {
		result = (double)result/ope1;
		return result;
		
	}
	
	
	
}

