package br.com.fivee.appfivee.controller;

import br.com.fivee.appfivee.model.Ingresso;
import br.com.fivee.appfivee.service.IIngressoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class IngressoController {

    @Autowired
    IIngressoService service;

    @PostMapping("/ingresso")
    public ResponseEntity<Ingresso> novoIngresso(@RequestBody Ingresso novoIngresso){
        Ingresso i = service.novoIngresso(novoIngresso);
        if(i != null)
            return ResponseEntity.status(201).body(i);
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/ingresso/{id}")
    public ResponseEntity<List<Ingresso>> buscaIngressosId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarIngressosId(id));
    }
}
