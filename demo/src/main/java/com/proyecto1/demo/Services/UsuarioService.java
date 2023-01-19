package com.proyecto1.demo.Services;
import com.proyecto1.demo.Entity.Educacion;
import com.proyecto1.demo.Entity.Usuarios;
import com.proyecto1.demo.Exception.UserNotFoundException;
import com.proyecto1.demo.Repository.UsuarioRepo;
import com.proyecto1.demo.Security.Entity.Usuario;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

   
    
    public Usuarios addUsuario(Usuarios usuarios){
        return usuarioRepo.save(usuarios);
    }
    public List<Usuarios> buscarUsuario(){
        return usuarioRepo.findAll();
    }
    public Usuarios editarUsuario(Usuarios usuarios){
        return usuarioRepo.save(usuarios);
    }
    public void borrarUsuario(Long id){
           usuarioRepo.deleteById(id);
    }
    
    public Usuarios buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() -> new UserNotFoundException("usuario no encontrado"));
    }


   
}
