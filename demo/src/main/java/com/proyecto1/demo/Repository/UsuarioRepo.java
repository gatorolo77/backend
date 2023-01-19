package com.proyecto1.demo.Repository;

import com.proyecto1.demo.Entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuarios, Long> {
}
