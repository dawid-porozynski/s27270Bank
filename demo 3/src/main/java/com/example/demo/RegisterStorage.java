package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

}
