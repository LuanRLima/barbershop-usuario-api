package com.manguetech.edu.cliente.core.aplication.usecases.endereco;

import com.manguetech.edu.cliente.core.domain.entities.Endereco;

public interface EnderecoService {
    Endereco criarEndereco(Endereco endereco);
    Endereco buscarEnderecoPorId(Long id);
    void atualizarEndereco(Endereco endereco);
    void excluirEndereco(Long id);
}
