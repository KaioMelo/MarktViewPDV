package br.com.marktview.service;

import br.com.marktview.model.Usuario;
import br.com.marktview.repository.UsuarioRepository;
import br.com.marktview.utils.MatriculaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrarUsuario(Usuario novoUsuario){

        if(usuarioRepository.existsByEmail(novoUsuario.getEmail())){
            throw new RuntimeException("Erro: Este e-mail já está cadastrado!");
        }

        long matriculaGerada;
        do {
            matriculaGerada = MatriculaUtils.gerarMatriculaAleatoria();
        } while (usuarioRepository.existsByMatricula(matriculaGerada));

        String senhaCriptografada =  passwordEncoder.encode(novoUsuario.getSenha());

        novoUsuario.setSenha(senhaCriptografada);
        novoUsuario.setMatricula(matriculaGerada);

        return usuarioRepository.save(novoUsuario);
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> buscarPorMatricula(Long matricula){
        return usuarioRepository.findByMatricula(matricula);
    }
}
