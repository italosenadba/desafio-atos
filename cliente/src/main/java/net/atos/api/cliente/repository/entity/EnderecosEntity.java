package net.atos.api.cliente.repository.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.validation.constraints.NotBlank;

public class EnderecosEntity {
	
	@EmbeddedId
	private EnderecosPK id;
	
	@Column(name = "RUA")
	@NotBlank(message = "Campo Rua não pode ser nulo")
	private String rua;
	
	@Column(name = "NUMERO")
	private short numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "CIDADE")
	private String cidade;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "CEP")
	private String cep;
	
	@Column(name = "END_PADRAO")
	private Boolean endPadrao;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Boolean getEndPadrao() {
		return endPadrao;
	}

	public void setEndPadrao(Boolean endPadrao) {
		this.endPadrao = endPadrao;
	}
	
	
	
	
	
	
	

}
