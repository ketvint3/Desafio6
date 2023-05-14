package SpringAvancado.com.Desafio6.repository;

import SpringAvancado.com.Desafio6.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByCpf(String cpf);
}
