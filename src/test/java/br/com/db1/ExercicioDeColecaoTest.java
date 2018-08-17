package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExercicioDeColecaoTest {
	
	@Test
	public void exercicio2Test() {
		
		ExercicioDeColecao ex = new ExercicioDeColecao();
		ex.exercicio2();
		assertTrue(ex.exercicio2()== 2);
		assertEquals(2, ex.exercicio2(), 0);
		
	}
	

}
