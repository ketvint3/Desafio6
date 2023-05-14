package SpringAvancado.com.Desafio6.repository;

import SpringAvancado.com.Desafio6.models.ClinicaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicaRepository extends JpaRepository<ClinicaModel, Integer> {
}
