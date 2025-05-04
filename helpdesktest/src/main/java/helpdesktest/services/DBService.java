package helpdesktest.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import helpdesktest.domains.Chamado;
import helpdesktest.domains.Cliente;
import helpdesktest.domains.Tecnico;
import helpdesktest.domains.enumns.Prioridade;
import helpdesktest.domains.enumns.Status;
import helpdesktest.repositores.ChamadoRepository;
import helpdesktest.repositores.ClienteRepository;
import helpdesktest.repositores.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void InstanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Marcus Aurelio", "098765645", "Marcus@email.com", "admin");

		Cliente cl1 = new Cliente(null, "jose", "987655566565", "jose@email.com", "admin");
		Chamado ch1 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "chamado1", "chamado1 teste", cl1, tec1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cl1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}
}
