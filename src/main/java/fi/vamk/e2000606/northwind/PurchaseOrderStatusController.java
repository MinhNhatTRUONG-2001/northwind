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
public class PurchaseOrderStatusController {
    @Autowired
    private PurchaseOrderStatusRepository repository;

    @GetMapping("/purchase-order-status/{id}")
    public Optional<PurchaseOrderStatus> getPurchaseOrderStatus(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/all-purchase-order-status")
    public Iterable<PurchaseOrderStatus> getAllPurchaseOrderStatus(){
        return repository.findAll();
    }
    
    @PostMapping("/purchase-order-status")
    public PurchaseOrderStatus save(@RequestBody PurchaseOrderStatus purchase_order_status){
        return repository.save(purchase_order_status);
    }

    @PutMapping("/purchase-order-status")
    public PurchaseOrderStatus update(@RequestBody PurchaseOrderStatus purchase_order_status){
        return repository.save(purchase_order_status);
    }

    @DeleteMapping("/purchase-order-status")
    public void delete(@RequestBody PurchaseOrderStatus purchase_order_status){
        repository.delete(purchase_order_status);
    }
    
}