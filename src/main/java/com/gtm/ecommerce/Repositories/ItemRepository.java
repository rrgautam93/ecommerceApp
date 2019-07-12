package com.gtm.ecommerce.Repositories;

import com.gtm.ecommerce.Entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,String>{

}
