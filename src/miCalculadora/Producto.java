package miCalculadora;



/**
 * Clase que realiza el producto de varios operandos.
 *
 * @author tanis
 *
 */
public class Producto {

	/**
	 * Números de tipo real que serán los operandos de los métodos correspondientes
	 * 
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
	static int resultado;
	/**
	 * Método que multiplica los dos números reales introducidos como parámetros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @return Devuelve un número real que es el resultado de la multiplicación de los dos números introducidos como parámetros
	 */
	
	public double producto(double ope1, double ope2) {
		if (ope1!=0 && ope2!=0) {
		
		result = ope1*ope2;}
		return result;
		
		
	}
	/**
	 * Método que multiplica dos números enteros introducidos como parámetros
	 * @param suman1 Primer operando
	 * @param suman2 Segundo operando
	 * @return Devuelve un número entero que es el resultado de la multiplicación de los dos números introducidos como parámetros
	 */
	public static double productoint (int oper1, int oper2) {
		if (oper1!=0 && oper2!=0) {
		 
		resultado = oper1*oper2;}
		return resultado;
		
	}
	/**
	 * Método que multiplica tres números reales introducidos como parámetros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @param ope3 Tercer operando
	 * @return Devuelve un número real, resultado de multiplicar los introducidos por parámetro
	 */
	public static double producto(double ope1, double ope2, double ope3) {
		if (ope1!=0 && ope2!=0 && ope2!=0) {
		result = ope1*ope2*ope3;}
		return result;
		
	}
	/**
	 * Método que realiza la potencia de un número dado (base) elevado a otro (exponente)
	 * @param ope1 Operando introducido como parámetro
	 * @return Devuelve un número real que es el resultado de elevar el primer número (base) al segundo (exponente)
	 * Número demasiado altos arrojarán la exception OutOfRange
	 */
	
	public static double potencia(double ope1, double ope2) {
		result = Math.pow(ope1, ope2);
		return result;
		
	}
	
	
	
}
