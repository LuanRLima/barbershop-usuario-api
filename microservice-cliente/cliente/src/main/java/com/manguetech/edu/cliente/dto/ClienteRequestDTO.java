package com.manguetech.edu.cliente.dto;

import com.manguetech.edu.cliente.core.domain.entities.Endereco;
import lombok.Data;

import java.util.Date;

@Data
public class ClienteRequestDTO {

    private String nome;
    private String email;
    private String telefone;
    private Date dataNascimento;
    private Endereco endereco;
    private Integer pontosFidelidade;
}
