package com.desafio.itau.controller;

import com.desafio.itau.model.Transacao;
import com.desafio.itau.service.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity criarTransacao(@Valid @RequestBody Transacao transacao) {
        transacaoService.save(transacao);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity excluirTransacao() {
        transacaoService.deleteAll();
        return ResponseEntity.ok().build();
    }
}
