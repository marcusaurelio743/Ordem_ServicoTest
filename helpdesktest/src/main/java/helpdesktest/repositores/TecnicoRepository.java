package helpdesktest.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import helpdesktest.domains.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {

}
