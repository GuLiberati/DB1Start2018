package ExercicioColecao;

import java.util.ArrayList;
import java.util.List;



public class ColecaoSolution {

	public static void main(String [] args) {
		
		exercicio1(); 
		exercicio2();
		exercicio3();
		
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
	
}
