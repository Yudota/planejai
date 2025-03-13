package com.planejaochurras.planejaochurras.services;


import com.planejaochurras.planejaochurras.models.Participante;
import com.planejaochurras.planejaochurras.repositories.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> listarTodos() {
        return participanteRepository.findAll();
    }

    public Optional<Participante> buscarPorId(Long id) {
        return participanteRepository.findById(id);
    }

    public Participante salvar(Participante participante) {
        return participanteRepository.save(participante);
    }

    public void deletar(Long id) {
        participanteRepository.deleteById(id);
    }
}
