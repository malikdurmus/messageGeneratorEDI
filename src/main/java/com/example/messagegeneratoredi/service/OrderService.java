package com.example.messagegeneratoredi.service;

import com.example.messagegeneratoredi.OrderData;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class OrderService implements MessageService<OrderData> {


    @PostMapping("/orders/processOrder")
    @ResponseBody
    @Override
    public boolean processOrder(@RequestBody OrderData orderData) { //OrderData should changed -> OrderMessage
        // Process the order data here
        System.out.println("Received order data: " + orderData.toString());
        System.out.println("-----------");
        System.out.println(orderData.getMailPartner());

        // this function should not return true if there was something wrong with the process ->
        // program logic is to implement!!
        return true;

    }
}
