package net.atos.api.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClienteVO {
	
	private long id;
	
	@NotNull(message = "Campo não pode ser nulo")
	private String nome;
	
	@NotNull(message = "Campo não pode ser nulo")
	private char tipoPessoa;
	
	@NotNull(message = "Campo não pode ser nulo")
	private String docPrincipal;
	
	@NotNull(message = "Campo não pode ser nulo")
	private String telefone;
	
	private String celular;
	
	@Email
	private String email;
	
	private double limiteCredito;
	
	@NotNull(message = "Campo não pode ser nulo")
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	@NotNull(message = "Campo não pode ser nulo")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataCriacao;
	
	
	@NotNull(message = "Campo Endereço não pode ser nulo")
	@Size(min = 1, message = "Campo Endereço deve ter pelo menos um Endereço")
	@Valid
	private List<EnderecoVO> enderecos;
	
	@NotNull(message = "Campo Forma Pagamento não pode ser nulo")
	@Size(min = 1, message = "Campo Forma Pagamento deve ter pelo menos uma Forma de Pagamento")
	@Valid

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(char tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getDocPrincipal() {
		return docPrincipal;
	}

	public void setDocPrincipal(String docPrincipal) {
		this.docPrincipal = docPrincipal;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<EnderecoVO> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoVO> enderecos) {
		this.enderecos = enderecos;
	}
	

}
