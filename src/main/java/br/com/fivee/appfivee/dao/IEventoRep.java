package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoRep extends CrudRepository<Evento, Integer> {
}
