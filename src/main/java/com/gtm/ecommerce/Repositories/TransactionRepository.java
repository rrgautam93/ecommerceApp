package com.gtm.ecommerce.Repositories;

import com.gtm.ecommerce.Entities.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Purchase,Long>{

}
