package br.com.edusync.api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data // @Data = LOMBOK (cria automaticamente os gets e os sets)
@Entity(name = "tb_tabela")// resumindo, liga o java no banco de dados

public class Produto {

    /// IMFORMAÇOES QUE VAO ARMAZENAR DENTRO DO MEU CADASTRO DE PRODUTO
    @Id // indentificador ( primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera um valou automaticamente do id
    @Column(name = "ID") //modifiar nome
    private Integer codigo;

    @Column(length = 100) //quantidade de caracteres
    private String descricao;
    private BigDecimal precoVenda;
    private LocalDate dataValidade;

}
