package br.com.db1type;

public enum TipoLogradouro {
	
	RUA ("Rua","R"),
	FAZENDA ("Fazenda","FZ"),
	PRACA ("Pra�a","PC"),
	AVENIDA ("Avenida","AV");
	
	String descricaoLogradouro;
	String siglaLogradouro;
	
	TipoLogradouro(String descricao, String sigla){
		
		descricaoLogradouro = descricao;
		siglaLogradouro = sigla;
		
	}
	
	public String getDescricaoLogradouro(){
		
		return descricaoLogradouro;
		
	}
	
	public String getSiglaLogradouro(){
		
		return siglaLogradouro;
		
	}

}
