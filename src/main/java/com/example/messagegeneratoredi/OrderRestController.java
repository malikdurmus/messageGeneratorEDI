/*
package com.example.messagegeneratoredi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OrderRestController {
    public ArrayList<OrderData> arrayList = new ArrayList<>();
    @PostMapping("/processOrder")
    public String processOrder(@RequestBody OrderData orderData) {
        // Process the order data here
        System.out.println("Received order data: " + orderData.toString());
        arrayList.add(orderData);
        System.out.println("-----------");
        System.out.println(orderData.getMailPartner());;
        // Example: Save order data to a database

        // Redirect to a success page
        return "redirect:/orderSuccess";
    }
}
*/
