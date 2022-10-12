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
public class OrdersController {
    @Autowired
    private OrdersRepository repository;

    @GetMapping("/order/{id}")
    public Optional<Orders> getOrder(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/orders")
    public Iterable<Orders> getOrders(){
        return repository.findAll();
    }
    
    @PostMapping("/order")
    public Orders save(@RequestBody Orders order){
        return repository.save(order);
    }

    @PutMapping("/order")
    public Orders update(@RequestBody Orders order){
        return repository.save(order);
    }

    @DeleteMapping("/order")
    public void delete(@RequestBody Orders order){
        repository.delete(order);
    }
    
}