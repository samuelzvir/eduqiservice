package org.eduqi.eduqiservice.core.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cep" )
public class CEP {

	private String codigo;

	public CEP(){}
	
	public CEP(String codigo){
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}