package com.desafio.itau.service;

import com.desafio.itau.exception.TransacaoInvalidaException;
import com.desafio.itau.model.Transacao;
import com.desafio.itau.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;


    public Transacao save(Transacao transacao) {
        if(transacao.getValor() == null || transacao.getDataHora() == null || transacao.getValor().compareTo(BigDecimal.ZERO) < 0 || transacao.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new TransacaoInvalidaException();
        }
        return transacaoRepository.save(transacao);
    }
}
