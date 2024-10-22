package com.manguetech.edu.cliente.core.aplication.usecases.cliente;

import com.manguetech.edu.cliente.core.domain.entities.Cliente;

import java.util.Optional;

public interface BuscarClientePorEmailUseCase {
    Optional<Cliente> buscarClientePorEmail(String email);

}
