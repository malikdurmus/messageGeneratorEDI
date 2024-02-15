package com.example.messagegeneratoredi.service;

public interface MessageService<E> {

    boolean processOrder(E message); //processes the order and returns a boolean
                                    // to Controller.processOrder that calls it in Controller class


}
