package com.example.unit_testing.service;

import com.example.unit_testing.domain.Order;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmailServiceTest {

    @Test
    void sendEmail_shouldThrowException_usingMockito() {

        EmailService emailMock = mock(EmailService.class);

        try (MockedStatic<EmailService> mocked = mockStatic(EmailService.class)) {

            mocked.when(EmailService::getInstance)
                    .thenReturn(emailMock);

            Order order = new Order(1, "Laptop", 1000);

            doThrow(new RuntimeException("An Exception Occurred"))
                    .when(emailMock).sendEmail(any(Order.class));

            RuntimeException ex = assertThrows(RuntimeException.class, () -> {
                EmailService.getInstance().sendEmail(order);
            });

            assertEquals("An Exception Occurred", ex.getMessage());

            verify(emailMock).sendEmail(order);
        }
    }

    @Test
    void sendEmail_withCC_shouldReturnTrue_usingMockito() {

        EmailService emailMock = mock(EmailService.class);

        try (MockedStatic<EmailService> mocked = mockStatic(EmailService.class)) {

            mocked.when(EmailService::getInstance)
                    .thenReturn(emailMock);

            Order order = new Order(2, "Phone", 500);

            when(emailMock.sendEmail(any(Order.class), eq("cc@mail.com")))
                    .thenReturn(true);

            boolean result = EmailService.getInstance()
                    .sendEmail(order, "cc@mail.com");

            assertTrue(result);

            verify(emailMock).sendEmail(order, "cc@mail.com");
        }
    }
}
