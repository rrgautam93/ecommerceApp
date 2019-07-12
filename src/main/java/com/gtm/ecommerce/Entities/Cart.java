package com.gtm.ecommerce.Entities;

import java.util.List;

public class Cart {
    String email;
    List<Cartable> itemList;

    double getPrice(){
        double total = 0;
        for (Cartable item: itemList) {
            total+=item.getPrice();
        }
        return total;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cartable> getItemList() {
        return itemList;
    }

    public void setItemList(List<Cartable> itemList) {
        this.itemList = itemList;
    }
}
