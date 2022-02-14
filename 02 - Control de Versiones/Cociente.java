package Objetos;
/**
 * <h2>Clase que permite calcular el cociente entre n�meros introducidos como par�metros</h2>
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * En el caso de que el divisor sea 0, el resultado ser� siempre 0.
 * Si el dividendo es 0, lanzar� la excepci�n "DivByZeroException"
 * El resultado, aunque los operandos sean n�meros enteros ser� siempre de tipo double, con el fin de reflejar las divisiones no exactas.
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Cociente {
	/**
	 * N�meros de tipo real que ser�n los operandos de los m�todos correspondientes
	 */
	double ope1, ope2,ope3;

	/**
	 * N�mero real. Guardar� el resultado de los m�todos correspondientes
	 */
	double result;
	/**
	 * N�meros de tipo entero que ser�n los operandos de los m�todos correspondientes
	 */
	int oper1, oper2, oper3;
	
	/**
	 * N�mero entero. Guardar� el resultado de los m�todos correspondientes
	 */
	int resultado;
	/**
	 * M�todo que divide los dos n�meros reales introducidos como par�metros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @return Devuelve un n�mero real que es el resultado de la multiplicaci�n de los dos n�meros introducidos como par�metros
	 */
	
	public double cociente(double ope1, double ope2) {
		result = (double)ope1/ope2;
		return result;
		
	}
	/**
	 * M�todo que divide dos n�meros enteros introducidos como par�metros
	 * @param suman1 Primer operando
	 * @param suman2 Segundo operando
	 * @return Devuelve un n�mero real que es el resultado de la divisi�n de los dos n�meros introducidos como par�metros
	 */
	
		public double cocienteint(double oper1, double oper2) {
			result = oper1*oper2;
			return result;
			}
			
	/**
	 * M�todo que divide la unidad por otro n�mero introducido como par�metro
	 * @param ope1 Primer operando
	 * @return Devuelve un n�mero real, inverso del introducido por par�metro
	 */
	public double inverso(double ope1) {
		result = (double)1/ope1;
		return result;
		
	}
	/**
	 * M�todo que devuelve la raiz cuadrada del n�mero introducido como par�metro
	 * @param ope1 Operando introducido como par�metro
	 * @return Devuelve un n�mero real es la raiz cuadrada del par�metro introducido
	 */
	
	public double raiz(double ope1) {
		result = (double)result/ope1;
		return result;
		
	}
}