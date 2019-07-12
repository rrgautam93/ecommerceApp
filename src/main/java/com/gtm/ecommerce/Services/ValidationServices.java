package com.gtm.ecommerce.Services;

import com.gtm.ecommerce.Entities.Cart;

public interface ValidationServices{

    //apply to a cart and it will validate as per it's responsibility
    boolean apply(Cart cart) throws Exception;

}
