package com.planejaochurras.planejaochurras.services;

import com.planejaochurras.planejaochurras.models.Evento;
import com.planejaochurras.planejaochurras.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> listarTodos() {
        return eventoRepository.findAll();
    }

    public Optional<Evento> buscarPorId(Long id) {
        return eventoRepository.findById(id);
    }

    public Evento salvar(Evento evento) {
        if (evento.getParticipantes() == null || evento.getParticipantes().isEmpty()) {
            throw new IllegalArgumentException("O evento deve ter pelo menos um participante.");
        }
        evento.getParticipantes().forEach(participante -> participante.setEvento(evento));
        return eventoRepository.save(evento);
    }

    public void deletar(Long id) {
        eventoRepository.deleteById(id);
    }
}
