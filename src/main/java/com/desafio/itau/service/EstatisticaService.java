package com.desafio.itau.service;

import com.desafio.itau.dto.EstatisticaDTO;
import com.desafio.itau.model.Transacao;
import com.desafio.itau.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class EstatisticaService {
    @Autowired
    private TransacaoRepository transacaoRepository;
    @Autowired
    private AnaliseEstatisticaService analiseEstatisticaService;

    public EstatisticaDTO getEstatistica() {
        EstatisticaDTO estatistica = new EstatisticaDTO();
        List<Transacao> transacoes = transacaoRepository.getByDataHoraAfter((OffsetDateTime.now().minusSeconds(60)));
        if(transacoes.isEmpty()) {
            return estatistica;
        }
        estatistica.setSum(analiseEstatisticaService.getSum(transacoes));
        estatistica.setCount(Long.valueOf(transacoes.size()));
        estatistica.setAvg(analiseEstatisticaService.getAvg(transacoes));
        estatistica.setMin(analiseEstatisticaService.getMin(transacoes));
        estatistica.setMax(analiseEstatisticaService.getMax(transacoes));
        return estatistica;
    }
}
