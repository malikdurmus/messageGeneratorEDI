package com.example.messagegeneratoredi.service;

import com.example.messagegeneratoredi.datastructure.OrderMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Service
public class OrderService implements MessageService<OrderMessage> {


    @PostMapping("/orders/processOrder")
    @ResponseBody
    @Override
    public boolean processMessage(OrderMessage orderMessage) {
        // Process the order data here
        System.out.println("Received order data: " + orderMessage);

        // Example: Get a specific value from the order data

        // Return true if the process was successful, otherwise false
        return true;
    }

}
