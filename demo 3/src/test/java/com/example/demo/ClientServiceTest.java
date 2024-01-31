package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClientServiceTest {
    @Mock
    private ClientStorage clientStorage;
    @InjectMocks
    private ClientService clientService;

    @Test
    void shouldReturnTrue() {
        // GIVEN
        String clientName = "xxx";
        when(clientStorage.getCustomerByName("xxx")).thenReturn(Optional.empty());
        // WHEN
        boolean result = clientService.customerDoesNotExist("xxx");
        // THEN
        assertThat(result).isEqualTo(true);
    }

    @Test
    void shouldReturnFalse() {
        // GIVEN
        String clientName = "xxx";
        when(clientStorage.getCustomerByName("xxx")).thenReturn(Optional.of(new Client(clientName,125)));
        // WHEN
        boolean result = clientService.customerDoesNotExist("xxx");
        // THEN
        assertThat(result).isEqualTo(false);
    }
}