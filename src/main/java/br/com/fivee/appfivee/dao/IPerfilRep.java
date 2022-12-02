package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Perfil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerfilRep extends CrudRepository<Perfil, Integer> {
}
