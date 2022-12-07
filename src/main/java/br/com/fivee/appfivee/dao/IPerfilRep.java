package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Perfil;
import br.com.fivee.appfivee.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerfilRep extends CrudRepository<Perfil, Integer> {

    @Query(value = "select * from tbl_perfil where usuario.usuario = :usuario", nativeQuery = true)
    public Perfil buscaUsuario (String usuario);
}
