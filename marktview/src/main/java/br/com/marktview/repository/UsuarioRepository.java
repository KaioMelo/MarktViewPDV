package br.com.marktview.repository;

import br.com.marktview.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {

    Optional<Usuario> findById(Long id);

    boolean existsById(Long id);

    Optional<Usuario> findByMatricula(Long Matricula);

    boolean existsByMatricula(Long matricula);

    boolean existsByEmail(String email);

}
