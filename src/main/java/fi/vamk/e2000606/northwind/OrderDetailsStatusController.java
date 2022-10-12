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
public class OrderDetailsStatusController {
    @Autowired
    private OrderDetailsStatusRepository repository;

    @GetMapping("/order-details-status/{id}")
    public Optional<OrderDetailsStatus> getOrderDetailsStatus(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/all-order-details-status")
    public Iterable<OrderDetailsStatus> getAllOrderDetailsStatus(){
        return repository.findAll();
    }
    
    @PostMapping("/order-details-status")
    public OrderDetailsStatus save(@RequestBody OrderDetailsStatus order_details_status){
        return repository.save(order_details_status);
    }

    @PutMapping("/order-details-status")
    public OrderDetailsStatus update(@RequestBody OrderDetailsStatus order_details_status){
        return repository.save(order_details_status);
    }

    @DeleteMapping("/order-details-status")
    public void delete(@RequestBody OrderDetailsStatus order_details_status){
        repository.delete(order_details_status);
    }
    
}