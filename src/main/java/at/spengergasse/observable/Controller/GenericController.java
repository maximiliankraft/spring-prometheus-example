package at.spengergasse.observable.Controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import at.spengergasse.observable.Entity.GenericEntity;
import at.spengergasse.observable.Repositories.GenericRepository;
import lombok.AllArgsConstructor;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/generic")
public class GenericController {

    GenericRepository repo;

    @GetMapping("/")
    List<GenericEntity> findAll(){
        return repo.findAll();
    }

    @PostMapping("/")
    GenericEntity addOne(GenericEntity entity){
        return repo.save(entity);
    }


}
