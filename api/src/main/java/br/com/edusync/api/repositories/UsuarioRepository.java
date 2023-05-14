package br.com.edusync.api.repositories;

import br.com.edusync.api.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //findBY =
  Usuario findByUsername(String username);
}
