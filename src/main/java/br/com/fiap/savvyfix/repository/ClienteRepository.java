package br.com.fiap.savvyfix.repository;

import br.com.fiap.savvyfix.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
