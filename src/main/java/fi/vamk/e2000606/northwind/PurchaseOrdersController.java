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
public class PurchaseOrdersController {
    @Autowired
    private PurchaseOrdersRepository repository;

    @GetMapping("/purchase-order/{id}")
    public Optional<PurchaseOrders> getPurchaseOrder(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/purchase-orders")
    public Iterable<PurchaseOrders> getPurchaseOrders(){
        return repository.findAll();
    }
    
    @PostMapping("/purchase-order")
    public PurchaseOrders save(@RequestBody PurchaseOrders purchase_order){
        return repository.save(purchase_order);
    }

    @PutMapping("/purchase-order")
    public PurchaseOrders update(@RequestBody PurchaseOrders purchase_order){
        return repository.save(purchase_order);
    }

    @DeleteMapping("/purchase-order")
    public void delete(@RequestBody PurchaseOrders purchase_order){
        repository.delete(purchase_order);
    }
    
}