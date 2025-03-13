package com.planejaochurras.planejaochurras.models;


import com.planejaochurras.planejaochurras.enums.TipoParticipante;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private TipoParticipante tipoParticipante;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;


}
