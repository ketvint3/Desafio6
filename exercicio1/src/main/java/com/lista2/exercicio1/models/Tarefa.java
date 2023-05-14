package com.lista2.exercicio1.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Tarefa {
    private Integer titulo;
    private String descricao;
    private LocalDate dataValidade;
}
