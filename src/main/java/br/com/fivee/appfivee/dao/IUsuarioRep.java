package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRep extends CrudRepository<Usuario, Integer> {
    @Query(value = "select * from tbl_usuario where email = :email and senha = :senha", nativeQuery = true)
    public Usuario testeLogin(String email, String senha);
}
