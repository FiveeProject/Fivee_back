package br.com.fivee.appfivee.controller;

import br.com.fivee.appfivee.model.Usuario;
import br.com.fivee.appfivee.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    IUsuarioService service;

    @PostMapping("/register")
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario novo_usuario){
        Usuario user = service.cadastrarUsuario(novo_usuario);
        if(user != null)
            return ResponseEntity.status(201).body(user);
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> validarLogin(@RequestBody Usuario usuario){
        Usuario user = service.validarUsuario(usuario);
        if(user != null)
            return ResponseEntity.status(200).body(user);
        return ResponseEntity.badRequest().build();
    }
}
