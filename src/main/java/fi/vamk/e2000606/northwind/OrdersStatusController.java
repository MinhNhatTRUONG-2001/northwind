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
public class OrdersStatusController {
    @Autowired
    private OrdersStatusRepository repository;

    @GetMapping("/orders-status/{id}")
    public Optional<OrdersStatus> getOrdersStatus(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/all-orders-status")
    public Iterable<OrdersStatus> getAllOrdersStatuss(){
        return repository.findAll();
    }
    
    @PostMapping("/orders-status")
    public OrdersStatus save(@RequestBody OrdersStatus orders_status){
        return repository.save(orders_status);
    }

    @PutMapping("/orders-status")
    public OrdersStatus update(@RequestBody OrdersStatus orders_status){
        return repository.save(orders_status);
    }

    @DeleteMapping("/orders-status")
    public void delete(@RequestBody OrdersStatus orders_status){
        repository.delete(orders_status);
    }
    
}