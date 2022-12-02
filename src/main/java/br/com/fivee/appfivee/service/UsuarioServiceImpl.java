package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.dao.IUsuarioRep;
import br.com.fivee.appfivee.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    IUsuarioRep rep;

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return rep.save(usuario);
    }

    @Override
    public Usuario validarUsuario(Usuario usuario) {
        return rep.testeLogin(usuario.getEmail(), usuario.getSenha());
    }
}
