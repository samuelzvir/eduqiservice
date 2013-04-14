package br.org.eduqi.domain;

/**
 * Objeto utilizado no cache de pesquisa 
 * 
 */

public class CacheSearch {

	private Integer idEscola;
	private String nomeEscola;
	
	public CacheSearch(Integer idEscola, String nomeEscola) {
		super();
		this.idEscola = idEscola;
		this.nomeEscola = nomeEscola;
	}
	public Integer getIdEscola() {
		return idEscola;
	}
	public void setIdEscola(Integer idEscola) {
		this.idEscola = idEscola;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	
	
}
