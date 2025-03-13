package com.planejaochurras.planejaochurras.controllers;

import com.planejaochurras.planejaochurras.models.Participante;
import com.planejaochurras.planejaochurras.services.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participante")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    public List<Participante> listarTodos() {
        return participanteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Participante> buscarPorId(@PathVariable Long id) {
        return participanteService.buscarPorId(id);
    }

    @PostMapping
    public Participante criarParticipante(@RequestBody Participante participante) {
        return participanteService.salvar(participante);
    }

    @DeleteMapping("/{id}")
    public void deletarParticipante(@PathVariable Long id) {
        participanteService.deletar(id);
    }
}
