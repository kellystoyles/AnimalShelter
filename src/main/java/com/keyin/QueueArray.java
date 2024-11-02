package com.keyin;

public class QueueArray {
    private String name;
    private int order;
    private String animalType;

    public QueueArray(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name != null ? name : "Unknown";
    }

    public String getAnimalType() {
        return animalType;
    }

}

