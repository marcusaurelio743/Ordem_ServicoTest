package helpdesktest.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import helpdesktest.domains.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
