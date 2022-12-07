package br.com.fivee.appfivee.controller;

import br.com.fivee.appfivee.model.Evento;
import br.com.fivee.appfivee.service.IEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EventoController {
    @Autowired
    private IEventoService service;

    @PostMapping("/eventos/register")
    public ResponseEntity<Evento> novoEvento(@RequestBody Evento evento){
        Evento eve = service.cadastrarEvento(evento);
        if(eve != null)
            return ResponseEntity.status(201).body(eve);
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/eventos/{id}")
    public ResponseEntity<Evento> atualizarEvento(@RequestBody Evento eventoAtt, @PathVariable Integer id){
        eventoAtt.setId(id);
        Evento res = service.atualizarEvento(eventoAtt);
        if(res != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/eventos/{id}")
    public ResponseEntity<?> removerEvento(@PathVariable Integer id){
        service.removerEvento(id);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/eventos")
    public ResponseEntity<List<Evento>> buscarEventos(){
        return ResponseEntity.ok(service.buscaEventos());
    }

    @GetMapping("/eventos/{id}")
    public ResponseEntity<Evento> consultaEvento(@PathVariable Integer id){
        Evento eve = service.buscarEventoId(id);
        if(eve != null)
            return ResponseEntity.status(201).body(eve);
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/eventos/search")
    public ResponseEntity<List<Evento>> consultaPorChave(@RequestParam(name="k") String chave){
        return ResponseEntity.ok(service.buscarPorPalavraChave(chave));
    }
}
