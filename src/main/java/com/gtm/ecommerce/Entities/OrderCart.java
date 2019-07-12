package com.gtm.ecommerce.Entities;

import java.util.List;

public class OrderCart {
    String email;
    List<Order> items;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getItems() {
        return items;
    }

    public void setItems(List<Order> items) {
        this.items = items;
    }
}
