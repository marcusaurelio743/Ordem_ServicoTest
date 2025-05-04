package helpdesktest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import helpdesktest.domains.Tecnico;
import helpdesktest.repositores.TecnicoRepository;

@Service
public class TecnicoService {
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Long id) {
		Optional<Tecnico> tec = repository.findById(id);
		return tec.orElse(null);
	}

}
