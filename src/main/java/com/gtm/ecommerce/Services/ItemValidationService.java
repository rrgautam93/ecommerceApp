package com.gtm.ecommerce.Services;

import com.gtm.ecommerce.Entities.Cart;
import com.gtm.ecommerce.Entities.Item;
import com.gtm.ecommerce.Entities.OrderCart;
import com.gtm.ecommerce.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemValidationService implements ValidationServices {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> apply(OrderCart cart) throws Exception {
        return false;
    }

}
