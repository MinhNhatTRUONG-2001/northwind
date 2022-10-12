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
public class InventoryTransactionTypesController {
    @Autowired
    private InventoryTransactionTypesRepository repository;

    @GetMapping("/inventory-transaction-type/{id}")
    public Optional<InventoryTransactionTypes> getInventoryTransactionType(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/inventory-transaction-types")
    public Iterable<InventoryTransactionTypes> getInventoryTransactionTypes(){
        return repository.findAll();
    }
    
    @PostMapping("/inventory-transaction-type")
    public InventoryTransactionTypes save(@RequestBody InventoryTransactionTypes inventory_transaction_type){
        return repository.save(inventory_transaction_type);
    }

    @PutMapping("/inventory-transaction-type")
    public InventoryTransactionTypes update(@RequestBody InventoryTransactionTypes inventory_transaction_type){
        return repository.save(inventory_transaction_type);
    }

    @DeleteMapping("/inventory-transaction-type")
    public void delete(@RequestBody InventoryTransactionTypes inventory_transaction_type){
        repository.delete(inventory_transaction_type);
    }
    
}