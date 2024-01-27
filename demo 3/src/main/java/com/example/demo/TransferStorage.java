package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TransferStorage {

        private List<Transfer> transfers = new ArrayList<>();
        public List<Transfer> getAllTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
}
