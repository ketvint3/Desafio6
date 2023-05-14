package SpringAvancado.com.Desafio6.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_clinica")
public class ClinicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cnpj;
    private String nomeClinica;

}
