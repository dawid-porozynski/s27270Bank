package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {


    private final RegisterStorage registerStorage;

    public RegisterService(RegisterStorage registerStorage) {
        this.registerStorage = registerStorage;
    }


    public Transfer makeRegister() {
        if(registerStorage == null){

        }


    }
}
