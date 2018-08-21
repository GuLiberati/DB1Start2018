package br.com.db1type;

import static org.junit.Assert.*;

import org.junit.Test;

public class TipoLogradouroTest {

	@Test
	public void siglaLogradouroTest(){
		
		assertEquals("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals("FZ", TipoLogradouro.FAZENDA.getSiglaLogradouro());
	}
	
	@Test
	public void descricaoLogradouroTest(){
		
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLogradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLogradouro());
	}

}
