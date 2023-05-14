package SpringAvancado.com.Desafio6.repository;

import SpringAvancado.com.Desafio6.models.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteModel, Integer> {
}
