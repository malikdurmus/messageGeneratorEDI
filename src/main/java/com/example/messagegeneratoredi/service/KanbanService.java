package com.example.messagegeneratoredi.service;

import com.example.messagegeneratoredi.datastructure.KanbanMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class KanbanService implements MessageService<KanbanMessage>{


    @PostMapping("/orders/processKanban")
    @ResponseBody
    @Override
    public boolean processOrder(KanbanMessage message) {
        return false;
    }
}
