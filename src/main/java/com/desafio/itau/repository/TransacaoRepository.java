package com.desafio.itau.repository;

import com.desafio.itau.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;
import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
    List<Transacao> getByDataHoraAfter(OffsetDateTime dataHoraAfter);
}
