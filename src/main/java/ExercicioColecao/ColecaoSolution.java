package ExercicioColecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColecaoSolution {

	public static void main(String[] args) {

		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
		exercicio6();
		exercicio7();
		exercicio8();
		exercicio14();
	}

	public static List<String> exercicio1() {

		List<String> nomesCores = new ArrayList<String>();
		nomesCores.add("Vermelho");
		nomesCores.add("Preto");
		nomesCores.add("Azul");
		nomesCores.add("Roxo");
		nomesCores.add("Amarelo");
		nomesCores.add("Rosa");
		nomesCores.add("Verde");
		nomesCores.add("Branco");

		return nomesCores;

	}

	public static Integer exercicio2() {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Fusca");
		nomes.add("Mariah");

		return nomes.size();
	}

	public static List<String> exercicio3() {

		List<String> parentes = new ArrayList<String>();
		parentes.add("pai");
		parentes.add("mãe");
		parentes.add("irmãos");
		parentes.add("irmãs");
		parentes.add("tios");
		parentes.add("tias");
		parentes.add("primos");

		System.out.println(parentes);

		parentes.remove("pai");
		parentes.remove("mãe");

		System.out.println(parentes);

		return parentes;

	}

	public static List<String> exercicio4() {

		List<String> cidades = new ArrayList<String>();
		cidades.add("Curitiba");
		cidades.add("Maringá");
		cidades.add("Cianorte");

		cidades.remove("Maringá");

		System.out.println(cidades);

		return cidades;

	}

	public static List<String> exercicio5() {

		List<String> nomesCores = new ArrayList<String>();
		nomesCores = exercicio1();
		Collections.sort(nomesCores);

		System.out.println(nomesCores);

		return nomesCores;

	}

	public static List<String> exercicio6() {

		List<String> nomesCores = new ArrayList<String>();
		nomesCores = exercicio1();
		nomesCores.remove("Vermelho");

		System.out.println(nomesCores);

		return nomesCores;

	}

	public static List<String> exercicio7() {

		List<String> parentes = new ArrayList<String>();
		parentes = exercicio3();
		Collections.sort(parentes);
		Collections.reverse(parentes);

		System.out.println(parentes);

		return parentes;

	}

	public static List<Integer> exercicio8() {
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();
		for (Integer posicao = 1; posicao <= 20; posicao++) {
			if (posicao % 2 == 0) {
				pares.add(posicao);
			}
			if (posicao % 2 != 0) {
				impares.add(posicao);
			}
		}
		total.addAll(pares);
		total.addAll(impares);
		
		System.out.println(pares);
		System.out.println(impares);
		
		return total;
	}
	
	public static Set<String> exercicio14(){
		Set<String> nomes = new TreeSet<String>();
		nomes.add("ANA");
		nomes.add("ANA LAURA");
		nomes.add("JOSE");
		nomes.add("WAGNER");
		nomes.add("RODOLFO");
		nomes.add("ROBERVAL");
		nomes.add("RODOLPHO");
		nomes.add("VAGNER");
		nomes.add("JOSÉ");
		nomes.add("JOALDO");
		nomes.add("CLECIO");
		nomes.add("JOSÉ");
		nomes.add("MARIA");
		nomes.add("MARCOS");
		
		nomes.remove("JOSÉ");
		
		System.out.println(nomes);
		
		return nomes;	
	}

}
