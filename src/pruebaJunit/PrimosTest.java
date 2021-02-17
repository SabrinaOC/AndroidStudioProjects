package pruebaJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimosTest {

	@Test
	public void testPrimos () {
		int resultado []= menorMayor_primo.primos(12);
		int esperado [] = new int [] {11, 7, 5};
		
		assertArrayEquals(esperado, resultado);
	}
	
	@Test
	public void testMenorMayor () {
		int array [] = new int [] {8, 6, 12};
		int resultado [] = menorMayor_primo.menorMayor(array);
		int esperado [] = new int [] {6, 8, 12};
	}
	
	


}
