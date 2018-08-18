package ExercicioColecao;

import org.junit.Test;

import br.com.db1.ExercicioDeColecao;
import static org.junit.Assert.*;

public class ColecaoSolutionTest {

	@Test
	public void exercicio1Test() {

		ColecaoSolution ex1 = new ColecaoSolution();
		ex1.exercicio1();
		assertTrue(ex1.exercicio1().get(0).equals("Vermelho"));
		assertTrue(ex1.exercicio1().get(1).equals("Preto"));
		assertTrue(ex1.exercicio1().get(2).equals("Azul"));

	}

	@Test
	public void exercicio2Test() {

		ExercicioDeColecao ex2 = new ExercicioDeColecao();
		ex2.exercicio2();
		assertTrue(ex2.exercicio2() == 2);
		assertEquals(2, ex2.exercicio2(), 0);

	}

	@Test
	public void exercicio3Test() {

		ColecaoSolution ex3 = new ColecaoSolution();
		ex3.exercicio3();
		assertTrue(ex3.exercicio3().get(0) != "pai");

	}

	@Test
	public void exercicio4Test() {

		ColecaoSolution ex4 = new ColecaoSolution();
		ex4.exercicio4();
		assertTrue(ex4.exercicio4().get(1) != "Maringá");

	}

	@Test
	public void exercicio5Test() {

		ColecaoSolution ex = new ColecaoSolution();
		assertTrue(ex.exercicio5().get(0) != "Vermelho");

	}

	@Test
	public void exercicio6Test() {

		ColecaoSolution ex = new ColecaoSolution();
		assertTrue(ex.exercicio6().get(0) != "Vermelho");

	}

	@Test
	public void exercicio7Test() {

		ColecaoSolution ex = new ColecaoSolution();
		assertTrue(ex.exercicio7().get(0) == "tios");

	}

	@Test
	public void exercicio8Test() {
		
		ColecaoSolution ex = new ColecaoSolution();
		assertTrue(ex.exercicio8().get(0) == 2);
	}
	
	@Test
	public void exercicio14Test() {
		
		ColecaoSolution ex = new ColecaoSolution();
		assertTrue(ex.exercicio14().contains("ANA"));
		
	}
	
}
