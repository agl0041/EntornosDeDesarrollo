import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void sumatorio() 
	{
		int sumaEsperada = 10;
		int sumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada, sumaObtenida);
	}
	
	@Test
	void factorial() 
	{
		int factorialEsperado = 120;
		int factorialObtenido = Algoritmos.factorial(5);
		assertEquals(factorialEsperado, factorialObtenido);
	}
}