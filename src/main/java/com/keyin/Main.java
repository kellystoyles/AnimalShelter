package com.keyin;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public class Main {
        public static void main(String[] args) {
                AnimalShelter shelter = new AnimalShelter();

                // Add some animals
                shelter.offer(new QueueArray("Abby", "dog"));
                shelter.offer(new QueueArray("Max", "cat"));
                shelter.offer(new QueueArray("Toby", "dog"));
                shelter.offer(new QueueArray("Teddy", "cat"));
                shelter.offer(new QueueArray("Shakey", "dog"));
                shelter.offer(new QueueArray("Tiger", "cat"));
                shelter.offer(new QueueArray("Snoopy", "dog"));
                shelter.offer(new QueueArray("Pusskins", "cat"));

                // Print out heading
                System.out.println( "\nKelly's Animal Shelter" );
                System.out.println( "-----------------------" );

                // Print all shelter animals
                System.out.println("\nAll our animals in the shelter:");
                shelter.printAllAnimals();

                // Peek at next available animals
                QueueArray nextAny = shelter.peekAny();
                QueueArray nextDog = shelter.peekDog();
                QueueArray nextCat = shelter.peekCat();

                // Print out next available animals
                System.out.println("\nA sneek peek at our next available animals:");
                System.out.println("Our next available animal to adopt is: " + nextAny.getName());
                System.out.println("Our next available dog to adopt is: " + nextDog.getName());
                System.out.println("Our next available cat to adopt is: " + nextCat.getName());

                // Adopt animals
                QueueArray a1 = shelter.pollAny();
                QueueArray d1 = shelter.pollDog();
                QueueArray c1 = shelter.pollCat();
                QueueArray a2 = shelter.pollAny();

                // Print out of adopted animals
                System.out.println("\nOur adopted animals:");
                System.out.println("Our first adopted animal: " + a1.getName());
                System.out.println("Our first adopted dog was: " + d1.getName());
                System.out.println("Our first adopted cat was: " + c1.getName());

                // Print out footer
                System.out.println("\n-----------------------");
                System.out.println("Thank you for visiting Kelly's Animal Shelter!");



        }
        }
