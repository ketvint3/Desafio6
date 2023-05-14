package br.com.edusync.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Telefone {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descriçao;

    private Integer numero;

    @ManyToOne // MUITOS PRA UM
    private Pessoa pessoa;
}
