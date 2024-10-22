package com.manguetech.edu.cliente.core.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class HistoricoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;
    private String servicoId;
    @Temporal(TemporalType.DATE)
    private Date data;
    private BigDecimal valor;

}
