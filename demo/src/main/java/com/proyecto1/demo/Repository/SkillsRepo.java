package com.proyecto1.demo.Repository;

import com.proyecto1.demo.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills, Long> {
}
