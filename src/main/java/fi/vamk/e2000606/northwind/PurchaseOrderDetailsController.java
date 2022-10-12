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
public class PurchaseOrderDetailsController {
    @Autowired
    private PurchaseOrderDetailsRepository repository;

    @GetMapping("/purchase-order-detail/{id}")
    public Optional<PurchaseOrderDetails> getPurchaseOrderDetail(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/purchase-order-details")
    public Iterable<PurchaseOrderDetails> getPurchaseOrderDetails(){
        return repository.findAll();
    }
    
    @PostMapping("/purchase-order-detail")
    public PurchaseOrderDetails save(@RequestBody PurchaseOrderDetails purchase_order_detail){
        return repository.save(purchase_order_detail);
    }

    @PutMapping("/purchase-order-detail")
    public PurchaseOrderDetails update(@RequestBody PurchaseOrderDetails purchase_order_detail){
        return repository.save(purchase_order_detail);
    }

    @DeleteMapping("/purchase-order-detail")
    public void delete(@RequestBody PurchaseOrderDetails purchase_order_detail){
        repository.delete(purchase_order_detail);
    }
    
}