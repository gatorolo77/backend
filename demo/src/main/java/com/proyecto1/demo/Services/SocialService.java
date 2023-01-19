
package com.proyecto1.demo.Services;

import com.proyecto1.demo.Entity.Social;
import com.proyecto1.demo.Repository.SocialRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SocialService {
    
     private final SocialRepo socialRepo;
     
      @Autowired
    public SocialService(SocialRepo socialRepo) {
        this.socialRepo = socialRepo;
    }
    public Social addSocial(Social social){
        return socialRepo.save(social);
    }
    public List<Social> buscarSocial(){
        return socialRepo.findAll();
    }
    public Social editarSocial(Social social){
        return socialRepo.save(social);
    }
   
    public void borrarSocial(Long id){

        socialRepo.deleteById(id);
    }
}
