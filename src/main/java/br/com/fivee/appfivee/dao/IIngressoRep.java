package br.com.fivee.appfivee.dao;

import br.com.fivee.appfivee.model.Ingresso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngressoRep extends CrudRepository<Ingresso, Integer> {
}