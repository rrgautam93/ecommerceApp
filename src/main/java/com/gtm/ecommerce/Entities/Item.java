package com.gtm.ecommerce.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item extends Cartable{

    @Id
    @GeneratedValue
    private Long id;


    @Override
    public String getSku(){
        return id.toString();
    }

    @Override
    public void setSku(String sku){
        this.id = Long.parseLong(sku);
    }
}
