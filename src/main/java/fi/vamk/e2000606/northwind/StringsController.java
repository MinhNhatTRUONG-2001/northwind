package fi.vamk.e2000606.northwind;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {
    @Autowired
    private StringsRepository repository;

    @GetMapping("/string/{id}")
    public Optional<Strings> getString(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/strings")
    public Iterable<Strings> getStrings(){
        return repository.findAll();
    }
    
    @PostMapping("/string")
    public Strings save(@RequestBody Strings string){
        return repository.save(string);
    }

    @PutMapping("/string")
    public Strings update(@RequestBody Strings string){
        return repository.save(string);
    }

    @DeleteMapping("/string")
    public void delete(@RequestBody Strings string){
        repository.delete(string);
    }
    
}