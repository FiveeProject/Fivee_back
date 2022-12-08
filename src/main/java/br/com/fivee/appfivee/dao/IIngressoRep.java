package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Ingresso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIngressoRep extends CrudRepository<Ingresso, Integer> {

    //@Query(value="select * from tbl_ingresso where tbl_evento_id_evento = :idEvento", nativeQuery = true)
    public List<Ingresso> findAllByEventoId(Integer idEvento);
}
