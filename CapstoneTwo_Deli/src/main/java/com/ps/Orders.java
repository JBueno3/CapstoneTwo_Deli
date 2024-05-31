package com.ps;

/*
This class represents a single "order" from the deli. It is used to store/contain "products".
 */

import java.util.ArrayList;

public class Orders implements Prices {
    private ArrayList<Products> products;

    public Orders() {
        this.products = new ArrayList<>();
    }

    public void add(Products product) {
        this.products.add(product);
    }

    public void clear() {
        this.products.clear();
    }

    public void checkout() {
        double orderPrice = this.calcPrice();

        System.out.println("Your Order details:\n");
        for (Products product : this.products) {
            System.out.println(product);
        }

        System.out.printf("\u001b[1;4mTotal price:\u001b[24m $%.2f\u001b[22m\n", orderPrice);
    }

    @Override
    public double calcPrice() {
        double price = 0;
        for (int i = 0; i < this.products.size(); i++) {
            price += products.get(i).calcPrice();
        }
        return price;
    }


    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                '}';
    }
}