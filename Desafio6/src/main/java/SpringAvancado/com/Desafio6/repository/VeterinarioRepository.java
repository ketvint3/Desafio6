package SpringAvancado.com.Desafio6.repository;

import SpringAvancado.com.Desafio6.models.VeterinarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<VeterinarioModel, Integer> {
}
