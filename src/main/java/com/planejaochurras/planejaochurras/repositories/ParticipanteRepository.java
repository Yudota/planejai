package com.planejaochurras.planejaochurras.repositories;

import com.planejaochurras.planejaochurras.models.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}
