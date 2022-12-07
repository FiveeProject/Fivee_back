package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.dao.IPerfilRep;
import br.com.fivee.appfivee.model.Perfil;
import br.com.fivee.appfivee.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl implements IPerfilService{
    @Autowired
    IPerfilRep repo;

    @Override
    public Perfil cadastrarNovoPerfil(Perfil perfil) {
        if(perfil.getCpf().length() == 0 || perfil.getNome().length() == 0 || perfil.getUsuario() == null)
            return null;
        return repo.save(perfil);
    }

    @Override
    public Perfil buscarPerfil(String usuario){
        Perfil p = repo.buscaUsuario(usuario);
        if(p != null)
            return p;
        return null;
    }

    @Override
    public Perfil atualizarPerfil(Perfil perfil) {
        return repo.save(perfil);
    }
}
