package com.example.messagegeneratoredi.datastructure;
import java.util.HashMap;
import java.util.Map;

public class OrderMessage {
    private Map<String, Object> dynamicData;
    public OrderMessage() {
        this.dynamicData = new HashMap<>();
    }

    public Map<String, Object> getDynamicData() {
        return dynamicData;
    }

    public void setDynamicData(Map<String, Object> dynamicData) {
        this.dynamicData = dynamicData;
    }

    @Override
    public String toString() {
        return "OrderMessage{" +
                "\tdynamicData=" + dynamicData +
                '}';
    }
}
