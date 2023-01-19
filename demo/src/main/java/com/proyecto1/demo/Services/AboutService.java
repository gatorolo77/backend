
package com.proyecto1.demo.Services;

import com.proyecto1.demo.Entity.About;
import com.proyecto1.demo.Repository.AboutRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AboutService {
    private final AboutRepo aboutRepo;
    
     @Autowired
    public AboutService(AboutRepo aboutRepo) {
        this.aboutRepo = aboutRepo;
}
    public About addAbout(About about){
        return aboutRepo.save(about);
    }
    public List<About> buscarAbout(){
        return aboutRepo.findAll();
    }
    public About editarAbout(About about){
        return aboutRepo.save(about);
    }
    public void borrarAbout(Long id){
           aboutRepo.deleteById(id);
    }
    
}