package com.nofish;

public class Customer {
    String id;
    String cost;
    String discount;
    String amount;
    public Customer(String id, String cost, String discount, String amount) {
        this.id = id;
        this.cost = cost;
        this.discount = discount;
        this.amount = amount;
    }

    public void print() {
        System.out.println(id + "\t" + cost + "\t" + discount + "\t" + amount);
    }
}
