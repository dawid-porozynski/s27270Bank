package com.example.demo;

public class Register {


    private String customerName;
    private int balance;


    public Register(String customerName, int balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBalance() {
        return balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
