package com.desafio.itau.controller;

import com.desafio.itau.dto.EstatisticaDTO;
import com.desafio.itau.service.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {
    @Autowired
    private EstatisticaService estatisticaService;

    @GetMapping
    public ResponseEntity<EstatisticaDTO> getEstatistica() {
        EstatisticaDTO estatistica = estatisticaService.getEstatistica();
        return ResponseEntity.ok(estatistica);
    }
}
