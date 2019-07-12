package com.gtm.ecommerce.Services;

import com.gtm.ecommerce.Entities.Order;
import com.gtm.ecommerce.Entities.OrderCart;
import com.gtm.ecommerce.Entities.Purchase;

public class CheckoutService{

    public void accept(OrderCart cart){

        for(Order orderItem : cart.getItems()){
            Purchase purchase = new Purchase(orderItem, cart.getEmail());
        }
    }

}
