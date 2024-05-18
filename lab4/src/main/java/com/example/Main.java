package com.example;

public class Main {
  public static void main(String[] args) {
    // Creating a character using the builder
    Character character = Character.builder()
        .name("Aragorn")
        .health(100)
        .mana(50)
        .role("Warrior")
        .build();

    // Creating an item using the builder
    Item sword = Item.builder()
        .name("Anduril")
        .type("Sword")
        .power(20)
        .build();

    // Output to demonstrate usage
    System.out.println("Character Details:");
    System.out.println("Name: " + character.getName());
    System.out.println("Health: " + character.getHealth());
    System.out.println("Mana: " + character.getMana());
    System.out.println("Role: " + character.getRole());

    System.out.println("\nItem Details:");
    System.out.println("Name: " + sword.getName());
    System.out.println("Type: " + sword.getType());
    System.out.println("Power: " + sword.getPower());
  }
}