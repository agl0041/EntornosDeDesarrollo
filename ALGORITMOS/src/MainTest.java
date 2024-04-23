import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	void sumatorio1() 
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
	
	@Test
    void sumatorioParametroIncorrecto(){
        Exception excepcion = assertThrows(IllegalArgumentException.class, 
                                            () -> Algoritmos.sumatorio(-1));
        String esperado = "El numero debe ser igual o superior a cero";
        String obtenido = excepcion.getMessage();
        assertEquals(esperado, obtenido);
    }
}