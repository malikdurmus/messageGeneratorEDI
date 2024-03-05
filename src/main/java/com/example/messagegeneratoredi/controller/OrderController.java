
package com.example.messagegeneratoredi.controller;
import com.example.messagegeneratoredi.datastructure.OrderMessage;
import com.example.messagegeneratoredi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class OrderController {

    // The functionality used in this class will probably be needed in other Service classes too
    // It is a good idea to abstract with Controller interface / abstract class
    private static final String MESSAGE_SUCCESS = "Order data created successfully";
    private static final String MESSAGE_FAILURE = "Order data couldn't be created";

    @Autowired
    OrderService orderService;
    @PostMapping("/orders/processOrder")
    public ResponseEntity<String> processOrder(@RequestBody Map<String,Object> orderData) {
        OrderMessage orderMessage = new OrderMessage();
        orderMessage.setDynamicData(orderData); //This is a workaround because of faulty deserialization
                                                // from the JSON Object to Order Message
        boolean isSuccess = orderService.processMessage(orderMessage);
        String message = isSuccess ? "Order data created successfully" : "Order data couldn't be created";

        String jsonResponse = "{\"message\": \"" + message + "\"}";

        if (isSuccess) {
            return ResponseEntity.ok(jsonResponse);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonResponse);
        }

    }

}

