package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.model.Evento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEventoService {

    public Evento cadastrarEvento(Evento evento);
    public void removerEvento(Evento evento);
    public List<Evento> buscaEventos();
}
