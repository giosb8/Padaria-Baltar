package br.com.senai.infob.padariabaltar.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.padariabaltar.Repositories.UsuarioRepository;
import br.com.senai.infob.padariabaltar.models.Usuario;

@Service
public class UsuarioService {
      @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario, String confirmarSenha, String senha) {
        if (!senha.equals(confirmarSenha)) {
            return null;
        }

        usuarioRepository.save(usuario);
        return usuario;
    }

    public Boolean  delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Usuario login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return null;
        }

        if (!usuario.getSenha().equals(senha)) {
            System.out.println("Senha incorreta!");
            return null;
        }

        return usuario;
    }
    
    public boolean atualizar(Usuario usuario, Integer id) {
        Usuario alu = usuarioRepository.findById(id).get();
        if (alu != null) {
            usuario .setId(id);
            usuarioRepository.save(usuario);
            return true;
        }
        return false;
    }

     public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Integer id) {
    return usuarioRepository.findById(id).orElse(null);
}

   
}
