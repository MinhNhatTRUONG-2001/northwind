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
public class InventoryTransactionsController {
    @Autowired
    private InventoryTransactionsRepository repository;

    @GetMapping("/inventory-transaction/{id}")
    public Optional<InventoryTransactions> getInventoryTransaction(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/inventory-transactions")
    public Iterable<InventoryTransactions> getInventoryTransactions(){
        return repository.findAll();
    }
    
    @PostMapping("/inventory-transaction")
    public InventoryTransactions save(@RequestBody InventoryTransactions inventory_transaction){
        return repository.save(inventory_transaction);
    }

    @PutMapping("/inventory-transaction")
    public InventoryTransactions update(@RequestBody InventoryTransactions inventory_transaction){
        return repository.save(inventory_transaction);
    }

    @DeleteMapping("/inventory-transaction")
    public void delete(@RequestBody InventoryTransactions inventory_transaction){
        repository.delete(inventory_transaction);
    }
    
}