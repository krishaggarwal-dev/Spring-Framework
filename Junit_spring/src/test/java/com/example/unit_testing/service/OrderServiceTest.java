package com.example.unit_testing.service;

import com.example.unit_testing.domain.Order;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    @Test
    void placeOrder_shouldCalculateTax_andSendEmail() {

        EmailService emailMock = mock(EmailService.class);

        try (MockedStatic<EmailService> mocked = mockStatic(EmailService.class)) {

            mocked.when(EmailService::getInstance)
                    .thenReturn(emailMock);

            OrderService service = OrderService.getInstance();

            Order order = new Order(1, "Laptop", 1000);

            doNothing().when(emailMock).sendEmail(any(Order.class));

            service.placeOrder(order);

            // tax check
            assertEquals(1200, order.getPriceWithTax());

            // verify email call
            verify(emailMock).sendEmail(order);

            assertTrue(order.isCustomerNotified());
        }
    }
    @Test
    void placeOrder_whenEmailFails_shouldThrowException() {

        EmailService emailMock = mock(EmailService.class);

        try (MockedStatic<EmailService> mocked = mockStatic(EmailService.class)) {

            mocked.when(EmailService::getInstance)
                    .thenReturn(emailMock);

            OrderService service = OrderService.getInstance();

            Order order = new Order(1, "Phone", 500);

            doThrow(new RuntimeException("fail"))
                    .when(emailMock).sendEmail(any(Order.class));

            assertThrows(RuntimeException.class, () -> {
                service.placeOrder(order);
            });

            verify(emailMock).sendEmail(order);
        }
    }
    @Test
    void placeOrder_withCC_shouldReturnTrue() {

        EmailService emailMock = mock(EmailService.class);

        try (MockedStatic<EmailService> mocked = mockStatic(EmailService.class)) {

            mocked.when(EmailService::getInstance)
                    .thenReturn(emailMock);

            OrderService service = OrderService.getInstance();

            Order order = new Order(3, "Tablet", 200);

            when(emailMock.sendEmail(any(Order.class), eq("cc@mail.com")))
                    .thenReturn(true);

            boolean result = service.placeOrder(order, "cc@mail.com");

            assertTrue(result);
            assertTrue(order.isCustomerNotified());

            verify(emailMock).sendEmail(order, "cc@mail.com");
        }
    }
    @Test
    void placeOrder_withCC_shouldReturnFalse() {

        EmailService emailMock = mock(EmailService.class);

        try (MockedStatic<EmailService> mocked = mockStatic(EmailService.class)) {

            mocked.when(EmailService::getInstance)
                    .thenReturn(emailMock);

            OrderService service = OrderService.getInstance();

            Order order = new Order(3, "Mouse", 50);

            when(emailMock.sendEmail(any(Order.class), anyString()))
                    .thenReturn(false);

            boolean result = service.placeOrder(order, "cc@mail.com");

            assertFalse(result);
            assertFalse(order.isCustomerNotified());
        }
    }
}