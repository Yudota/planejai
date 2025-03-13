package com.planejaochurras.planejaochurras.controllers;


import com.planejaochurras.planejaochurras.models.Evento;
import com.planejaochurras.planejaochurras.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    private List<Evento> listarTodos() {
        return eventoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Evento> buscarPorId(@PathVariable Long id) {
        return eventoService.buscarPorId(id);
    }

    @PostMapping
    public Evento criarEvento(@RequestBody Evento evento) {
        System.out.println(evento.isPresencial());
        return eventoService.salvar(evento);
    }

    @DeleteMapping("/{id}")
    public void deletarEvento(@PathVariable Long id) {
        eventoService.deletar(id);
    }
}
