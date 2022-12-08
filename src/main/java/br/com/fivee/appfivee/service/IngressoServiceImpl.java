package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.dao.IIngressoRep;
import br.com.fivee.appfivee.model.Ingresso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngressoServiceImpl implements IIngressoService{
    @Autowired
    IIngressoRep repo;

    @Override
    public Ingresso novoIngresso(Ingresso ingresso) {
        return repo.save(ingresso);
    }

    @Override
    public List<Ingresso> buscarIngressosId(Integer idEvento) {
        return repo.findAllByEventoId(idEvento);
    }
}
