package com.manguetech.edu.cliente.adapters.out.persistence.repositories;

import com.manguetech.edu.cliente.core.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findById(Long id);

}
