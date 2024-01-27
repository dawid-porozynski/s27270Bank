package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class RegisterStorage {

    private List<Register> registerList;

    public RegisterStorage(){
        this.registerList=new ArrayList<>();
    }

    public void addRegister(Register register) {
        registerList.add(register);
    }

    public List<Register> getRegisterList() {
        return registerList;
    }

    public Optional<Register> getClientId(int clientId) {
        return registerList.stream().filter(car -> registerList.get().equals(vin)).findFirst();
    }
}
