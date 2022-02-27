package Objetos;

import AE3.Cociente; //ACF: Importamos el paquete con la clase principal

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCociente {
Cociente c1 ; //ACF: Creamos el tipo cociente con el que haremos las pruebas
	
	@BeforeEach 
	public  void clean () {
		c1 = new Cociente(); 
	}

	@Test
	public void testDivisionReales() {
		
		
		double Esperado = 7.62;
		double Obtenido = c1.divisionReales(70.1, 9.2);
		assertEquals(Esperado, Obtenido);
		
		
		
		Esperado =9.223372036854776E16;
		Obtenido = c1.divisionReales(70.2, 0);
		assertEquals(Esperado, Obtenido);
		
		
		Esperado =0.0;
		Obtenido = c1.divisionReales(0, -9870.5);
		assertEquals(Esperado, Obtenido);
		
	}
	
	@Test
	public void testDivisionEnteros() {
	
		
		int Esperado = 20;
		double Obtenido = c1.divisionEnteros(80, 4);
		assertEquals(Esperado, Obtenido);
		
	
		
		Esperado= 0;
		Obtenido = c1.divisionEnteros(0, 140);
		assertEquals(Esperado, Obtenido);
		
	}
	
	@Test
	public void testInverso() {
		
		double Esperado = 0.02;
		double Obtenido = c1.inverso(50.4);
		double inverso = Math.pow(c1.inverso(50.4), -1);
		
		assertEquals(Esperado, Obtenido);
		
		if (c1.inverso(50.4)*inverso == 1) {
			assertTrue(true);
		}
		
		
		Esperado = 9.223372036854776E16;
		Obtenido = c1.inverso(0);
		inverso = Math.pow(c1.inverso(0), -1);
		
		assertEquals(Esperado, Obtenido);
		
		if (c1.inverso(0)*inverso == 1) {
			assertTrue(true);
		}
		
	}
	@Test
	public void testRaiz() {
		
		
		double Esperado = 8.37;
		double Obtenido = c1.raiz(70);
				
		assertEquals(Esperado, Obtenido);
		
		if (Obtenido*Obtenido == c1.raiz(70)) {
			assertTrue(true);
		}
		
		
		Esperado = 0.0;
		Obtenido = Math.round(Math.sqrt(c1.raiz(0.0))*100.0)/100.0;
				
		assertEquals(Esperado, Obtenido);
		
		if (Obtenido*Obtenido == c1.raiz(0.0)) {
			assertTrue(true);
		}
		
		Esperado = 0.0;
		Obtenido = Math.round(Math.sqrt(c1.raiz(-7))*100.0)/100.0;
				
		assertEquals(Esperado, Obtenido);
		
		if (Obtenido*Obtenido == c1.raiz(-7)) {
			assertTrue(true);
		}

	}

}