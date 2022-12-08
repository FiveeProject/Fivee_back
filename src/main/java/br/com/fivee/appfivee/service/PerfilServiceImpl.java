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
        if(perfil.getCpf() == "" || perfil.getNome().length() == 0 || perfil.getUsuario() == null)
            return null;
        return repo.save(perfil);
    }

    @Override
    public Perfil buscarPerfilUsuario(Integer id){
        return repo.findAllByUsuarioId(id);
    }

    @Override
    public Perfil atualizarPerfil(Perfil perfil) {
        return repo.save(perfil);
    }
}
