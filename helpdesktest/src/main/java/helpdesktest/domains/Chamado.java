package helpdesktest.domains;

import java.time.LocalDate;
import java.util.Objects;

import helpdesktest.domains.enumns.Status;

public class Chamado {
	private Long id;
	private LocalDate data_abertura = LocalDate.now();
	private LocalDate data_fechamento;
	private Status status;
	private String titulo;
	private String observacoes;
	
	private Cliente cliente;
	private Tecnico tecnico;
	public Chamado(Long id, Status status, String titulo, String observacoes, Cliente cliente, Tecnico tecnico) {
		super();
		this.id = id;
		this.status = status;
		this.titulo = titulo;
		this.observacoes = observacoes;
		this.cliente = cliente;
		this.tecnico = tecnico;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(LocalDate data_abertura) {
		this.data_abertura = data_abertura;
	}
	public LocalDate getData_fechamento() {
		return data_fechamento;
	}
	public void setData_fechamento(LocalDate data_fechamento) {
		this.data_fechamento = data_fechamento;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
