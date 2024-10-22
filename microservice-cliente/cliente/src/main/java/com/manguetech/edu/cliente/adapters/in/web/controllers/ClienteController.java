package com.manguetech.edu.cliente.adapters.in.web.controllers;

import com.manguetech.edu.cliente.dto.ClienteRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cliente")
public class ClienteController {

    @PostMapping
    public ResponseEntity<ClienteRequestDTO> criarCliente(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        return null;
    }
}
