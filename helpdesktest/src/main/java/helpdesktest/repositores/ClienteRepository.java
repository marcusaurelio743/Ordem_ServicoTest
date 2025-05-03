package helpdesktest.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import helpdesktest.domains.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
