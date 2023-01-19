package com.proyecto1.demo.Controller;

import com.proyecto1.demo.Entity.Usuarios;
import com.proyecto1.demo.Services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

   

   
    @GetMapping("/id/{id}")
    public ResponseEntity<Usuarios> obtenerUsuario(@PathVariable("id") Long id){
        Usuarios usuarios = usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    
    @PutMapping("/update")
    public ResponseEntity<Usuarios> editarUsuario(@RequestBody Usuarios usuarios){
        Usuarios updateUsuario=usuarioService.editarUsuario(usuarios);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
}
