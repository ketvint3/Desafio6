package jpa.com.desafio5.repositories.criteria.params;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProdutoFilterParam {

    private String descricao;
    private BigDecimal precoVenda;
    private Integer saldoAtual;


}
