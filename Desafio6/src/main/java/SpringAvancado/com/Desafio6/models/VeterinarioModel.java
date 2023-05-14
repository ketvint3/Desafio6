package SpringAvancado.com.Desafio6.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_veterinario")
public class VeterinarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer crm;
    private String NomeCompleto;
    @ManyToOne
    @JoinColumn(name = "clinica_id")
    private ClinicaModel clinica;

}
