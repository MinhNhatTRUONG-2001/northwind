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
public class SalesReportsController {
    @Autowired
    private SalesReportsRepository repository;

    //Note: Use String id, not Integer id
    @GetMapping("/sales-report/{id}")
    public Optional<SalesReports> getSalesReport(@PathVariable("id") String id){
        return repository.findById(id);
    }

    @GetMapping("/sales-reports")
    public Iterable<SalesReports> getSalesReports(){
        return repository.findAll();
    }
    
    @PostMapping("/sales-report")
    public SalesReports save(@RequestBody SalesReports sales_report){
        return repository.save(sales_report);
    }

    @PutMapping("/sales-report")
    public SalesReports update(@RequestBody SalesReports sales_report){
        return repository.save(sales_report);
    }

    @DeleteMapping("/sales-report")
    public void delete(@RequestBody SalesReports sales_report){
        repository.delete(sales_report);
    }
    
}