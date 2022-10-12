package fi.vamk.e2000606.northwind;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
    
}
