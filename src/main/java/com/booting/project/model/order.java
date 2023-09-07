package com.booting.project.model;

import java.util.Date;

public class order {
    int id;
    String deliveryadreess;
    Date orderdate;
    double amount ;
    String restaurantname;
    String customername;

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryadreess() {
        return deliveryadreess;
    }

    public void setDeliveryadreess(String deliveryadreess) {
        this.deliveryadreess = deliveryadreess;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }
}
