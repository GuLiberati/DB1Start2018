package br.com.db1;

import br.com.db1type.TipoLogradouro;

public class ExemploEnum {

		public static void main(String[] args) {
			
			System.out.println("----------");
			System.out.print(TipoLogradouro.RUA.getDescricaoLogradouro()+"\t");
			System.out.println(TipoLogradouro.RUA.getSiglaLogradouro());
			System.out.println("----------");
			System.out.print(TipoLogradouro.PRACA.getDescricaoLogradouro()+"\t");
			System.out.println(TipoLogradouro.PRACA.getSiglaLogradouro());
			System.out.println("----------");
			System.out.print(TipoLogradouro.FAZENDA.getDescricaoLogradouro()+"\t");
			System.out.println(TipoLogradouro.FAZENDA.getSiglaLogradouro());
			System.out.println("----------");
			System.out.print(TipoLogradouro.AVENIDA.getDescricaoLogradouro()+"\t");
			System.out.println(TipoLogradouro.AVENIDA.getSiglaLogradouro());
			System.out.println("----------");
			
		}
	
}
