package com.proyecto1.demo.Security.Repository;

import com.proyecto1.demo.Security.Entity.Rol;
import com.proyecto1.demo.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

