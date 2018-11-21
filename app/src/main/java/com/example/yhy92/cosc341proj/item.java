package com.example.yhy92.cosc341proj;

public class item {

    private String name;

    public String getName() {
        return name;
    }

    private Double itemPrice, subtotalPrice;

    private Integer quantity;

    item(String name, Double price, Double subtotalPrice, Integer quantity){
        this.name = name;
        this.subtotalPrice = subtotalPrice;
        this.quantity = quantity;
    };





    void countSubtotal(Double price, int quantity){
        subtotalPrice = price * quantity;

    }



}
