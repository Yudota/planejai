package com.planejaochurras.planejaochurras.models;

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

    Evento(String nome,
           StatusEvento statusEvento,
           LocalDateTime dataInicio,
           LocalDateTime dataFim,
           String endereco,
           boolean isPresential){
this.setNome(nome);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private StatusEvento statusEvento;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String endereco;
    private boolean isPresential;


    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Participante> participantes;
}
