package Figuras;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestRectangulo 
{
	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll
	static void setup()
	{
		r1 = new Rectangulo();
		r2 = new Rectangulo(2, 3);
	}
	
	@Test
	void area()
	{
		double areaEsperada = 6;
		double areaObtenida = r2.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void area()
	{
		double areaEsperada = 4;
		double areaObtenida = r1.perimetro();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void perimetroRectangulo2()
	{
		double perimetroEsperado = 10;
		double perimetroObtenido = r2.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	
	/*
	 * Tarea:
	 * - area de r2
	 * - perimetro de r1
	 * - yperimetro de r2
	 */
	
}