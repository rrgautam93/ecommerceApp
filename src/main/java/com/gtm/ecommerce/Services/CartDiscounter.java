package com.gtm.ecommerce.Services;

import com.gtm.ecommerce.Entities.Cart;

public class CartDiscounter implements ValidationServices{

    @Override
    public boolean apply(Cart cart) throws Exception {

        return false;
    }

}
