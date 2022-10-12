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
public class SuppliersController {
    @Autowired
    private SuppliersRepository repository;

    @GetMapping("/supplier/{id}")
    public Optional<Suppliers> getSupplier(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/suppliers")
    public Iterable<Suppliers> getSuppliers(){
        return repository.findAll();
    }
    
    @PostMapping("/supplier")
    public Suppliers save(@RequestBody Suppliers supplier){
        return repository.save(supplier);
    }

    @PutMapping("/supplier")
    public Suppliers update(@RequestBody Suppliers supplier){
        return repository.save(supplier);
    }

    @DeleteMapping("/supplier")
    public void delete(@RequestBody Suppliers supplier){
        repository.delete(supplier);
    }
    
}