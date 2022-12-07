package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.model.Evento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IEventoService {

    public Evento cadastrarEvento(Evento evento);
    public void removerEvento(Integer id);
    public List<Evento> buscaEventos();
    public Evento buscarEventoId(Integer id);
    public List<Evento> buscarPorPalavraChave(String chave);
    public Evento atualizarEvento(Evento eventoAtt);
}
