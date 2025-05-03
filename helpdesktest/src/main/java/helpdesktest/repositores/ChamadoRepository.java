package helpdesktest.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import helpdesktest.domains.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
