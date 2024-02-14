
package com.example.messagegeneratoredi.controller;
import com.example.messagegeneratoredi.OrderData;
import com.example.messagegeneratoredi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
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
    public ResponseEntity<String> processOrder(@RequestBody OrderData orderData) {
        boolean isSuccess = orderService.processOrder(orderData);
        String message = isSuccess ? "Order data created successfully" : "Order data couldn't be created";

        String jsonResponse = "{\"message\": \"" + message + "\"}";

        if (isSuccess) {
            return ResponseEntity.ok(jsonResponse);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonResponse);
        }
    }

    // HashMap could be useful in the future if you want to configure a setting in the ui to let the user
    // know which messages have been created succesfully, alternatively with an in memory database.

   /* public ResponseEntity<Map<String, String>> processOrder(@RequestBody OrderData orderData) {
        boolean isSuccess = orderService.processOrder(orderData);
        String message = isSuccess ? "Order data created successfully" : "Order data couldn't be created";

        Map<String, String> jsonResponse = new HashMap<>();
        jsonResponse.put("message", message);
        if (isSuccess) {
            return ResponseEntity.ok(jsonResponse);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonResponse);
        }
    }*/

}

