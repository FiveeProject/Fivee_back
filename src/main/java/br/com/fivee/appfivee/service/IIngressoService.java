package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.model.Ingresso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IIngressoService {
    public Ingresso novoIngresso(Ingresso ingresso);
    public List<Ingresso> buscarIngressosId(Integer idEvento);
}
