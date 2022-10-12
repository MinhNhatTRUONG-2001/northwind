package fi.vamk.e2000606.northwind;

import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {
    
}
