package br.com.senai.infob.backend.projeto_comercio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.senai.infob.backend.projeto_comercio.models.Usuario;
import br.com.senai.infob.backend.projeto_comercio.services.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping ("/usuario")
public class UsuarioController {
    @Autowired 
    private UsuarioService usuarioService;

    @PostMapping("path")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }
    
}
