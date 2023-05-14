package SpringAvancado.com.Desafio6.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_agendamento")
public class AgendamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeAgendamento;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteModel paciente;
    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private VeterinarioModel veterinario;


}
