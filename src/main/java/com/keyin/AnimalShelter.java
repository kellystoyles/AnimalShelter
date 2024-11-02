package com.keyin;

import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Object> dogs = new LinkedList<>();
    private LinkedList <Object> cats = new LinkedList<>();
    private int order = 0;

    public void offer(QueueArray animal) {
        animal.setOrder(order);
        order++;

        if (animal.getAnimalType().equals("dog")) {
            dogs.addLast(animal);
        } else if (animal.getAnimalType().equals("cat")) {
            cats.addLast(animal);
        }
    }

    private QueueArray createDefaultAnimal(String type) {
        return new QueueArray(STR."No \{type} available", type);
    }
    public QueueArray pollAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return createDefaultAnimal("animal");
        } else if (dogs.isEmpty()) {
            return pollCat();
        } else if (cats.isEmpty()) {
            return pollDog();
        }

        QueueArray oldestDog = (QueueArray) dogs.peek();
        QueueArray oldestCat = (QueueArray) cats.peek();

        if (oldestDog.getOrder() < oldestCat.getOrder()) {
            return pollDog();
        } else {
            return pollCat();
        }
    }

    public QueueArray pollDog() {
        if (dogs.isEmpty()) {
            return null;
        }
        return (QueueArray) dogs.poll();
    }

    public QueueArray pollCat() {
        if (cats.isEmpty()) {
            return null;
        }
        return (QueueArray)cats.poll();
    }

    public QueueArray peekAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return peekCat();
        } else if (cats.isEmpty()) {
            return peekDog();
        }


        QueueArray oldestDog = (QueueArray) dogs.peek();
        QueueArray oldestCat = (QueueArray) cats.peek();

        if (oldestDog.getOrder() < oldestCat.getOrder()) {
            return oldestDog;
        } else {
            return oldestCat;
        }
    }

    public QueueArray peekDog() {
        return (QueueArray) dogs.peek();
    }

    public QueueArray peekCat() {
        return (QueueArray) cats.peek();
    }


    public void printAllAnimals() {
        System.out.println("Dogs: " + String.join(", ", dogs.stream().map(dog -> ((QueueArray) dog).getName()).toList()));
        System.out.println("Cats: " + String.join(", ", cats.stream().map(cat -> ((QueueArray) cat).getName()).toList()));
    }
        }


