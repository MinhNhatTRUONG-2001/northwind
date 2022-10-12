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
public class CustomersController {
    @Autowired
    private CustomersRepository repository;

    @GetMapping("/customer/{id}")
    public Optional<Customers> getCustomer(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/customers")
    public Iterable<Customers> getCustomers(){
        return repository.findAll();
    }
    
    @PostMapping("/customer")
    public Customers save(@RequestBody Customers customer){
        return repository.save(customer);
    }

    @PutMapping("/customer")
    public Customers update(@RequestBody Customers customer){
        return repository.save(customer);
    }

    @DeleteMapping("/customer")
    public void delete(@RequestBody Customers customer){
        repository.delete(customer);
    }
    
}