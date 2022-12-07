package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEventoRep extends CrudRepository<Evento, Integer> {
    public List<Evento> findAllByNomeContaining(String palavraChave);
}
