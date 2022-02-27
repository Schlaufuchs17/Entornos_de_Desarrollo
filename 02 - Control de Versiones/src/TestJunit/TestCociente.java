package Objetos;

import AE3.Cociente; //ACF: Importamos el paquete con la clase principal

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCociente {
Cociente C_1 ; //ACF: Creamos el tipo cociente con el que haremos las pruebas
	
	@BeforeEach 
	public  void clean () {
		C_1 = new Cociente(); 
	}

    //ACF: Creamos @Test para poder hacer pruebas

	@Test
	public void testcocienteint() { //Division de numeros reales
		
		
		double Esperado = 7.62;
		double Obtenido = C_1.cocienteint(70.1, 9.2);
		assertEquals(Esperado, Obtenido);
		
		
		
		Esperado =9.223372036854776E16;
		Obtenido = C_1.cocienteint(70.2, 0);
		assertEquals(Esperado, Obtenido);
		
		
		Esperado =0.0;
		Obtenido = C_1.cocienteint(0, -9870.5);
		assertEquals(Esperado, Obtenido);
		
	}
	
	@Test
	public void testcociente() { //Division de numeros enteros
	
		
		int Esperado = 20;
		double Obtenido = C_1.cociente(80, 4);
		assertEquals(Esperado, Obtenido);
		
	
		
		Esperado= 0;
		Obtenido = C_1.cociente(0, 140);
		assertEquals(Esperado, Obtenido);
		
	}
	
	@Test
	public void testInverso() { //Numero inverso
		
		double Esperado = 0.02;
		double Obtenido = C_1.inverso(50.4);
		double inverso = Math.pow(C_1.inverso(50.4), -1);
		
		assertEquals(Esperado, Obtenido);
		
		if (C_1.inverso(50.4)*inverso == 1) {
			assertTrue(true);
		}
		
		
		Esperado = 9.223372036854776E16;
		Obtenido = C_1.inverso(0);
		inverso = Math.pow(C_1.inverso(0), -1);
		
		assertEquals(Esperado, Obtenido);
		
		if (C_1.inverso(0)*inverso == 1) {
			assertTrue(true);
		}
		
	}
	@Test
	public void testRaiz() { //Raiz
		
		
		double Esperado = 8.37;
		double Obtenido = C_1.raiz(70);
				
		assertEquals(Esperado, Obtenido);
		
		if (Obtenido*Obtenido == C_1.raiz(70)) {
			assertTrue(true);
		}
		
		
		Esperado = 0.0;
		Obtenido = Math.round(Math.sqrt(C_1.raiz(0.0))*100.0)/100.0;
				
		assertEquals(Esperado, Obtenido);
		
		if (Obtenido*Obtenido == C_1.raiz(0.0)) {
			assertTrue(true);
		}
		
		Esperado = 0.0;
		Obtenido = Math.round(Math.sqrt(C_1.raiz(-7))*100.0)/100.0;
				
		assertEquals(Esperado, Obtenido);
		
		if (Obtenido*Obtenido == C_1.raiz(-7)) {
			assertTrue(true);
		}

	}

}