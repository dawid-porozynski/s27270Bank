package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ClientServiceIntegrationTest {
@MockBean
    private ClientStorage clientStorage;
@Autowired
     private ClientService clientService;

    @Test
    void contextLoads() {}

    @Test
    void shouldMakeTransfer() {
        // GIVEN
        when(clientStorage.getCustomerByName("xxx")).thenReturn(Optional.of(new Client("xxx",500)));
        // WHEN
        Transfer transfer = clientService.makeTransfer("xxx", 25);
        // THEN
        assertThat(clientStorage.getCustomerByName("xxx").get().getBalance()).isEqualTo(475);
        assertThat(transfer.getStatusType()).isEqualTo(StatusType.ACCEPTED);
    }
}