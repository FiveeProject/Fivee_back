package br.com.fivee.appfivee.service;

import br.com.fivee.appfivee.dao.IEventoRep;
import br.com.fivee.appfivee.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements IEventoService{
    @Autowired
    IEventoRep repo;

    @Override
    public Evento cadastrarEvento(Evento evento) {
        return repo.save(evento);
    }

    @Override
    public Evento atualizarEvento(Evento eventoAtt) {
        return repo.save(eventoAtt);
    }

    @Override
    public void removerEvento(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public List<Evento> buscaEventos() {
        return (List<Evento>) repo.findAll();
    }

    @Override
    public Evento buscarEventoId(Integer id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Evento> buscarPorPalavraChave(String chave){
        return repo.findAllByNomeContaining(chave);
    }
}
