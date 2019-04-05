package com.yrova.app.areas.giftshop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inventory {

    private Map<String, Integer> store = new HashMap<String, Integer>();
    private Map<String, Integer> store_stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.store.put(product, price);
        this.store_stock.put(product, stock);
    }

    public int price(String product) {
        if (this.store.containsKey(product)) {
            return this.store.get(product);
        }

        System.out.println("Item not present in inventory");
        return -99;
    }

    public int stock(String product) {
        if (this.store_stock.containsKey(product)) {
            return this.store_stock.get(product);
        }

        return 0;
    }

    public boolean take(String product) {

        int stock = this.store_stock.get(product);

        if (this.store_stock.containsKey(product) && stock > 0) {
            this.store_stock.replace(product, stock-1);
            return true;
        }

        return false;

    }

    //for printing to console
    public Set<String> products() {
        Set<String> items = new HashSet<String>();

        for (String i : this.store_stock.keySet()) {
            items.add(i);
        }

        return items;
    }
}