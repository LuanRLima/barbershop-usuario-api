package com.manguetech.edu.cliente.core.aplication.services.cliente;

import com.manguetech.edu.cliente.adapters.out.persistence.repositories.ClienteRepository;
import com.manguetech.edu.cliente.core.aplication.usecases.cliente.CriarClienteUseCase;
import com.manguetech.edu.cliente.core.domain.entities.Cliente;
import com.manguetech.edu.cliente.core.domain.validation.ValidadorCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarClienteService implements CriarClienteUseCase {

    @Autowired
    ClienteRepository repository;
    @Autowired
    ValidadorCliente validadorCliente;

    public Cliente criarCliente(Cliente cliente) {
       validadorCliente.validar(cliente);
         return repository.save(cliente);
    }

}
