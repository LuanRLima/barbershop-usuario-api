package com.manguetech.edu.cliente.core.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true, nullable = false)
    private String email;
    private String telefone;
    private Date dataNascimento;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<HistoricoServico> historico;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
    private Integer pontosFidelidade;

}
