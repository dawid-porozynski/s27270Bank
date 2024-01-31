package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ClientStorage {

    private List<Client> clientsList;

    public ClientStorage(){
        this.clientsList=new ArrayList<>();
    }

    public void addClient(Client clientToAdd) {
        clientsList.add(clientToAdd);
    }

    public Optional<Client> getCustomerByName(String clientName) {
        return clientsList.stream().filter(customer -> customer.getCustomerName().equals(clientName)).findFirst();
    }

    public void purgeDb() {
        clientsList.clear();
    }
}
