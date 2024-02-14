package com.example.messagegeneratoredi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/orders")
    public String showOrderPage() {
        // Add any necessary model attributes here
        return "orders.html";
    }
    @GetMapping("/kanban")
    public String showKanbanPage() {
        // Add any necessary model attributes here
        return "kanban.html";
    }
    @GetMapping("/stock-movements")
    public String showSVPage() {
        // Add any necessary model attributes here
        return "stock.html";
    }
    @GetMapping("/delfors")
    public String showDelforPage() {
        // Add any necessary model attributes here
        return "delfor.html";
    }


}
