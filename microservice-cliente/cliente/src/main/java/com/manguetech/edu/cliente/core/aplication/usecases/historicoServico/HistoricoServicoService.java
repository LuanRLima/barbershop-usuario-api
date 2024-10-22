package com.manguetech.edu.cliente.core.aplication.usecases.historicoServico;

import com.manguetech.edu.cliente.core.domain.entities.Cliente;
import com.manguetech.edu.cliente.core.domain.entities.HistoricoServico;

import java.util.List;

public interface HistoricoServicoService {
    HistoricoServico criarHistoricoServico(HistoricoServico historicoServico);
    HistoricoServico buscarHistoricoServicoPorId(Long id);
    List<HistoricoServico> buscarHistoricoServicoPorCliente(Cliente cliente);
    List<HistoricoServico> buscarHistoricoServicoPorServicoId(String servicoId);
    List<HistoricoServico> buscarHistoricoServicoPorData(String data);
    void atualizarHistoricoServico(HistoricoServico historicoServico);
    void excluirHistoricoServico(Long id);
}
