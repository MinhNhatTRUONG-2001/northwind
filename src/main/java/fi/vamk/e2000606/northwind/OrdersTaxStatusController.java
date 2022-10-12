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
public class OrdersTaxStatusController {
    @Autowired
    private OrdersTaxStatusRepository repository;

    @GetMapping("/orders-tax-status/{id}")
    public Optional<OrdersTaxStatus> getOrdersTaxStatus(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/all-orders-tax-status")
    public Iterable<OrdersTaxStatus> getAllOrdersTaxStatus(){
        return repository.findAll();
    }
    
    @PostMapping("/orders-tax-status")
    public OrdersTaxStatus save(@RequestBody OrdersTaxStatus orders_tax_status){
        return repository.save(orders_tax_status);
    }

    @PutMapping("/orders-tax-status")
    public OrdersTaxStatus update(@RequestBody OrdersTaxStatus orders_tax_status){
        return repository.save(orders_tax_status);
    }

    @DeleteMapping("/orders-tax-status")
    public void delete(@RequestBody OrdersTaxStatus orders_tax_status){
        repository.delete(orders_tax_status);
    }
    
}