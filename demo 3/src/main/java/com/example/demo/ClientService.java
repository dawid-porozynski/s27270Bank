package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {


    private final ClientStorage clientStorage;

    public ClientService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }


    public boolean customerDoesNotExist(String customerName) {
        Optional<Client> client = clientStorage.getCustomerByName(customerName);

        return client.isEmpty();
    }

    public void clientSignUp(int balance, String customerName) {
        Client newClient = new Client( customerName,balance);
        clientStorage.addClient(newClient);
    }
    public Transfer makeTransfer(String customerName, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return null;
        }

        Transfer transfer = new Transfer();
        Optional<Client> customer = clientStorage.getCustomerByName(customerName);

        if (customerDoesNotExist(customerName)) {
            System.out.println("No customer found");
            transfer.setStatusType(StatusType.DECLINED);
            return transfer;
        } else if (customer.get().getBalance() < amount) {
            System.out.println("Insufficient funds");
            transfer.setStatusType(StatusType.DECLINED);
            return transfer;
        }

        customer.get().withdraw(amount);
        transfer.setStatusType(StatusType.ACCEPTED);
        return transfer;
    }

    public Transfer depositMoney(String customerName, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return null;
        }

        Transfer transfer = new Transfer();
        Optional<Client> customer = clientStorage.getCustomerByName(customerName);

        if (customerDoesNotExist(customerName)) {
            System.out.println("No client found");
            transfer.setStatusType(StatusType.DECLINED);
            return transfer;
        }

        customer.get().deposit(amount);
        transfer.setStatusType(StatusType.ACCEPTED);
        return transfer;
    }
    public String getCustomerData(String customerName) {
        if (customerDoesNotExist(customerName)) {
            return "No customer found";
        }

        Client client = clientStorage.getCustomerByName(customerName).orElseThrow();

        return client.toString();
    }
}

