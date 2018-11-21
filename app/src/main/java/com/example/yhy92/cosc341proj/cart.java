package com.example.yhy92.cosc341proj;

import java.util.ArrayList;

public class cart {

    private

    ArrayList<item> cart = new ArrayList<>();

    cart(){

    };

    void add(String nameoffood, double price, int quantity){
        double subtotal = price * quantity;
        cart.add(new item(nameoffood, price, subtotal, quantity));
    }

    void delete(int index){
        cart.remove(index);
    }

    void cancel(){};
}

