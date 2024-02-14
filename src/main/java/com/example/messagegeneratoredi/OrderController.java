package com.example.messagegeneratoredi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("/processOrder")
    public String processOrder(@RequestBody OrderData orderData) {
        // Process the order data here
        System.out.println("Received order data: " + orderData);

        // Return a response if needed
        return "Order processed successfully!";
    }
}
