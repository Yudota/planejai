package com.planejaochurras.planejaochurras.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.planejaochurras.planejaochurras.enums.StatusEvento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.Pair;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor()
@AllArgsConstructor
@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private StatusEvento statusEvento;

    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String endereco;
    private boolean presencial;

    @JsonProperty("presencial")
    public boolean isPresencial() {
        return presencial;
    }

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    @JsonManagedReference

    private List<Participante> participantes;
}
