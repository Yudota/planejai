package com.planejaochurras.planejaochurras.dtos;

import com.planejaochurras.planejaochurras.enums.StatusEvento;



import java.time.LocalDateTime;

public class EventoDTO  {


    private String nome;
    private StatusEvento statusEvento;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String endereco;
    private boolean isPresential;


    public EventoDTO() {
        nome = "";
    }
}
