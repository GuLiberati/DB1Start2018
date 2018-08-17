package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDeColecao {
	
	public static void main(String[] args){
		
		exercicio2();
		
	}

	public static Integer exercicio2() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Fusca");
		nomes.add("Mariah");
		
		return nomes.size();
	}

}
