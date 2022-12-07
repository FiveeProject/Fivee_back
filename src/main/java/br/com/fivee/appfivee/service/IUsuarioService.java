package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface IUsuarioService {

    public Usuario cadastrarUsuario(Usuario usuario);
    public Usuario validarUsuario(Usuario usuario);

}
