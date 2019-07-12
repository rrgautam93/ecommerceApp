package com.gtm.ecommerce.Services;

import com.gtm.ecommerce.Entities.Cart;
import com.gtm.ecommerce.Entities.Cartable;

public class QuantityValidation implements ValidationServices{

    @Override
    public boolean apply(Cart cart) throws Exception {
        //validate first, whether item is present and in sufficient quantity

        for (Cartable item:cart.getItemList()) {
            if(item.getQuantity()<0)
                throw new Exception("Negative quantity for item sku:"+item.getSku());
        }
        return true;
    }
}
