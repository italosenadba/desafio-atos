package net.atos.api.cliente.repository.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_CLIENTE")
public class ClienteEntity {
	
	@Id
	@Column(name = "ID_CLIENTE")
	private Long id;
	
	@Column(name = "NOME_CLIENTE")
	private String nome;
	
	@Column(name = "TIPO_PESSOA")
	@NotNull(message = "Campo Tipo Pessoa não pode ser nulo")
	@Enumerated(EnumType.STRING)
	private String tipoPessoa;
	
	@Column(name = "DOC_PRINCIPAL")
	private String docPrincipal;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "CELULAR")
	private String celular;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DATA_NASCIMENTO")
	private LocalDate dataNascimento;
	
	@Column(name = "DATA_CRIACAO")
	private LocalDateTime dataCriacao;
	
	
	@NotNull(message = "Campo Endereços não pode ser nulo")
	@Size(min = 1, message = "Campo Endereços deve ser pelo menos um item")
	@Valid
	@OneToMany(mappedBy = "id.Cliente")
	private List<EnderecosEntity> enderecos;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipoPessoa() {
		return tipoPessoa;
	}


	public void setTipoPessoa(String tipoPessoa) {
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


	public List<EnderecosEntity> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<EnderecosEntity> enderecos) {
		this.enderecos = enderecos;
	}
	
	public void add(EnderecosEntity endereco) {
		List<EnderecosEntity> enderecosLocal =
				Optional.ofNullable(this.getEnderecos()).orElseGet(() -> new ArrayList());
		enderecosLocal.add(endereco);
		
		this.enderecos = enderecosLocal;
	}
	
	

}
