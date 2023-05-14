package SpringAvancado.com.Desafio6.repository;

import SpringAvancado.com.Desafio6.models.AgendamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<AgendamentoModel, Integer> {
}
