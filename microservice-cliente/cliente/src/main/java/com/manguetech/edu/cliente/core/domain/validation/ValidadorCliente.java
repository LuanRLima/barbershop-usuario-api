package com.manguetech.edu.cliente.core.domain.validation;

import com.manguetech.edu.cliente.core.domain.entities.Cliente;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Calendar;
import java.util.Date;

@Component
public class ValidadorCliente {

    public void validar(Cliente cliente) {

        if (StringUtils.isEmpty(cliente.getNome())) {
            throw new IllegalArgumentException("O nome do cliente é obrigatório");
        }

        if (cliente.getDataNascimento().after(new Date())) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, -11);
            Date dataLimite = calendar.getTime();
            if (cliente.getDataNascimento().after(dataLimite)) {
                throw new IllegalArgumentException("O cliente deve ter no mínimo 11 anos");
            }
        }
        if (cliente.getPontosFidelidade() < 0) {
            throw new IllegalArgumentException("Pontos de fidelidade devem ser não negativos");
        }
    }


}
