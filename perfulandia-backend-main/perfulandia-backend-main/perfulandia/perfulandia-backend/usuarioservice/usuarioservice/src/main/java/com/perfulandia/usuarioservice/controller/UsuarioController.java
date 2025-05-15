package com.perfulandia.usuarioservice.controller;

import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.service.UsuarioService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService service;

    //Constructor
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    //listar
    @GetMapping
    public List<Usuario> listar(){
       return service.listar();
    }
    //post
    @PostMapping
    public Usuario guardar (@RequestBody Usuario usuario){
        return service.guardar(usuario);
    }
    //id
    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id){
        return service.buscar(id);
    }
    //delete
    @DeleteMapping("/{id}")
        public void eliminar(@PathVariable Long id){
        
    }
}
