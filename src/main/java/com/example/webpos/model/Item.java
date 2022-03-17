package com.example.webpos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private Product product;
    private int quantity;

    @Override
    public String toString(){
        return product.toString() +"\t" + quantity;
    }

    public boolean equal(Item item){
        return this.product.getId() == item.product.getId();
    }

    public boolean add(Item item){
        int tmp = quantity + item.quantity;
        if(tmp >= 0){
            quantity = tmp;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        return quantity <= 0;
    }

}
