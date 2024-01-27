package com.example.demo;

public class Transfer {


    private int clientId;
    private int value;
    private StatusType statusType;

    public Transfer(int clientId, int value, StatusType statusType){
        this.clientId = clientId;
        this.value = value;
        this.statusType = statusType;
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
    @Override
    public String toString() {
        return "com.example.app.Car{" +
                "value='" + value + '\'' +
                ", clientId='" + clientId + '\'' +
                ", statusType='" + statusType + '\'' +
                '}';
    }

}
