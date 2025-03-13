package com.planejaochurras.planejaochurras.repositories;

import com.planejaochurras.planejaochurras.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
