package br.com.senai.infob.backend.projeto_comercio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam Integer password) {
        boolean logou = usuarioService.login(email, password);
        if (logou){
            return "Login efetuado.";
        }
        return "Credenciais inválidas.";
    }
    
    
}
