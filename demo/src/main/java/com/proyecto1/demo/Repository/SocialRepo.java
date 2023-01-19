/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto1.demo.Repository;

import com.proyecto1.demo.Entity.Social;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 2022
 */
public interface SocialRepo extends JpaRepository<Social , Long>{
    
}
