package com.example.demo;

public class Transfer {


    private int clientId;
    private int value;

    public Transfer(int clientId, int value){
        this.clientId = clientId;
        this.value = value;
    }
    private void status(){

    }
    private void newBalance(){

    }
    public int getClientId() {
        return clientId;
    }

    public int getValue() {
        return value;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
