package com.gtm.ecommerce.Entities;

import com.gtm.ecommerce.Services.QuantityValidation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Purchase {

    @Id
    @GeneratedValue
    Long id;

    String sku;
    String user;
    int quantity;
    Date date;
    double totalPrice;
    TransactionStatus status;


    public Purchase(Order orderItem, String user, Item dbItem){
        this.sku = orderItem.sku;
        this.quantity = orderItem.quantity;
        this.date = new Date();
        this.user = user;
        this.totalPrice = orderItem.quantity * dbItem.price;
        this.status = TransactionStatus.PENDING;
    }

}
