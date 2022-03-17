package com.example.webpos.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {

    private double total;

    private List<Item> items = new ArrayList<>();

    private void sumTotal(){
        double i = 0;
        for(Item iitem : items){
            i += iitem.getQuantity() * iitem.getProduct().getPrice();
        }
        total = i;
    }

    public boolean deleteItem(Item item){
        for(Item iitem:items){
            if(iitem.equal(item)) {
                items.remove(iitem);
                sumTotal();
                return true;
            }
        }
        return false;
    }

    public boolean addItem(Item item) {
        for(Item iitem:items) {
            if (iitem.equal(item)) {
                iitem.add(item);
                if (iitem.isEmpty()) {
                    items.remove(iitem);
                }
                sumTotal();
                return true;
            }
        }
        if(!item.isEmpty())items.add(item);
        sumTotal();
        return true;
    }

    @Override
    public String toString() {
        if (items.size() ==0){
            return "Empty Cart";
        }
        double total = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cart -----------------\n"  );

        for (int i = 0; i < items.size(); i++) {
            stringBuilder.append(items.get(i).toString()).append("\n");
            total += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
        }
        stringBuilder.append("----------------------\n"  );

        stringBuilder.append("Total...\t\t\t" + total );

        return stringBuilder.toString();
    }
}
