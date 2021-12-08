package net.atos.api.cliente.repository.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Embeddable
public class EnderecosPK {
	
	@Column(name = "ID_END")
	@NotNull(message = "Campo Id Endereço não pode ser nulo")
	private Long idEnd;
	
	@ManyToOne
	private ClienteEntity clienteEntity;

	public Long getIdEnd() {
		return idEnd;
	}

	public void setIdEnd(Long idEnd) {
		this.idEnd = idEnd;
	}

	public ClienteEntity getClienteEntity() {
		return clienteEntity;
	}

	public void setClienteEntity(ClienteEntity clienteEntity) {
		this.clienteEntity = clienteEntity;
	}
	
	

}
