package ivan.kaiser.autenticacao.jwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ivan.kaiser.autenticacao.jwt.models.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    public Optional<Usuario> findByLogin(String login);

}
