
package com.proyecto1.demo.Repository;

import com.proyecto1.demo.Entity.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepo extends JpaRepository<About,Long> {
    
}
