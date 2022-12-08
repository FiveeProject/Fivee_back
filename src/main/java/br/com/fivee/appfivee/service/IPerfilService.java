package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.model.Perfil;
import br.com.fivee.appfivee.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface IPerfilService {
    public Perfil cadastrarNovoPerfil(Perfil perfil);
    public Perfil buscarPerfilUsuario(Integer id);
    public Perfil atualizarPerfil(Perfil perfil);
}
