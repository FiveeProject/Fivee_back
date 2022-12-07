package br.com.fivee.appfivee.controller;

import br.com.fivee.appfivee.model.Perfil;
import br.com.fivee.appfivee.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PerfilController {
    @Autowired
    IPerfilService service;

    @PostMapping("/perfil")
    public ResponseEntity<Perfil> novoPerfil(@RequestBody Perfil perfil){
        Perfil p = service.cadastrarNovoPerfil(perfil);
        if(p != null)
            return ResponseEntity.status(201).body(p);
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/perfil/{usuario}")
    public ResponseEntity<Perfil> buscarPerfil(@PathVariable String usuario){
        Perfil p = service.buscarPerfil(usuario);
        if(p != null)
            return ResponseEntity.status(201).body(p);
        return ResponseEntity.badRequest().build();
    }
}
