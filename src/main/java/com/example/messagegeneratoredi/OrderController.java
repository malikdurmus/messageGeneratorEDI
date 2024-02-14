/*
package com.example.messagegeneratoredi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OrderController {



    @GetMapping("/orders")
    public String showOrderPage() {
        // Add any necessary model attributes here
        return "orders.html"; // Assuming your order HTML file is named "orders.html"
    }
} */

package com.example.messagegeneratoredi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class OrderController {

    private ArrayList<OrderData> arrayList = new ArrayList<>();

    @GetMapping("/orders")
    public String showOrderPage() {
        // Add any necessary model attributes here
        return "orders.html";
    }

    @PostMapping("/processOrder")
    public String processOrder(@RequestBody OrderData orderData) {
        // Process the order data here
        System.out.println("Received order data: " + orderData.toString());
        arrayList.add(orderData);
        System.out.println("-----------");
        System.out.println(orderData.getMailPartner());
        // Example: Save order data to a database

        // Redirect to a success page
        return "redirect:/orderSuccess";
    }
}

