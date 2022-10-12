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
public class OrderDetailsController {
    @Autowired
    private OrderDetailsRepository repository;

    @GetMapping("/order-detail/{id}")
    public Optional<OrderDetails> getOrderDetail(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/order-details")
    public Iterable<OrderDetails> getOrderDetails(){
        return repository.findAll();
    }
    
    @PostMapping("/order-detail")
    public OrderDetails save(@RequestBody OrderDetails order_detail){
        return repository.save(order_detail);
    }

    @PutMapping("/order-detail")
    public OrderDetails update(@RequestBody OrderDetails order_detail){
        return repository.save(order_detail);
    }

    @DeleteMapping("/order-detail")
    public void delete(@RequestBody OrderDetails order_detail){
        repository.delete(order_detail);
    }
    
}