package com.desafio.itau.service;

import com.desafio.itau.model.Transacao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

@Service
public class AnaliseEstatisticaService {

    public BigDecimal getSum(List<Transacao> transacoes) {
        return transacoes.stream()
                .map(Transacao::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getAvg(List<Transacao> transacoes) {
        return transacoes.stream()
                .map(Transacao::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(transacoes.size()), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getMin(List<Transacao> transacoes) {
        return transacoes.stream()
                .map(Transacao::getValor)
                .min(Comparator.naturalOrder())
                .orElse(BigDecimal.ZERO);
    }

    public BigDecimal getMax(List<Transacao> transacoes) {
        return transacoes.stream()
                .map(Transacao::getValor)
                .max(Comparator.naturalOrder())
                .orElse(BigDecimal.ZERO);
    }
}
