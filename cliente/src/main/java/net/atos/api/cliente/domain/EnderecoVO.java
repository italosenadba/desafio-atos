package net.atos.api.cliente.domain;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EnderecoVO {
	
	@NotNull(message = "Campo Id Endereço não pode ser nulo ou vazio")
	private long idEnd;
	
	@NotBlank(message = "Campo Rua não pode ser nulo ou vazio")
	private String rua;
	
	@Pattern(regexp = "[0-9]+", message = "Apenas numeros")
	private short numero;
	
	private String complemento;
	
	@NotBlank(message = "Campo Bairro não pode ser nulo ou vazio")
	private String bairro;
	
	@NotBlank(message = "Campo Cidade não pode ser nulo ou vazio")
	private String cidade;
	
	@NotBlank(message = "Campo Estado não pode ser nulo ou vazio")
	private String estado;
	
	@NotBlank(message = "Campo cep não pode ser nulo ou vazio")
	private String cep;
	
	@NotNull(message = "Campo não pode ser nulo")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataCriacao;
	
	public long getIdEnd() {
		return idEnd;
	}

	public void setIdEnd(long idEnd) {
		this.idEnd = idEnd;
	}

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

	public boolean isEndPadrao() {
		return endPadrao;
	}

	public void setEndPadrao(boolean endPadrao) {
		this.endPadrao = endPadrao;
	}

	private boolean endPadrao;

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
