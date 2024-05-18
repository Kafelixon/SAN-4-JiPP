package com.example;

public class Main {
  public static void main(String[] args) {
    // Character with mana
    Character mage = Character.builder()
        .name("Gandalf")
        .health(100)
        .mana(250)
        .role("Mage")
        .build();

    // Character without mana (uses default value)
    Character warrior = Character.builder()
        .name("Aragorn")
        .health(150)
        .role("Warrior")
        .build();

    // Creating an item using the builder
    Item sword = Item.builder()
        .name("Anduril")
        .type("Sword")
        .power(20)
        .build();

    // Output to demonstrate usage
    System.out.println("Mage Details:");
    System.out.println("Name: " + mage.getName());
    System.out.println("Health: " + mage.getHealth());
    System.out.println("Mana: " + mage.getMana());
    System.out.println("Role: " + mage.getRole());

    System.out.println("\nWarrior Details:");
    System.out.println("Name: " + warrior.getName());
    System.out.println("Health: " + warrior.getHealth());
    System.out.println("Mana: " + warrior.getMana());
    System.out.println("Role: " + warrior.getRole());

    System.out.println("\nItem Details:");
    System.out.println("Name: " + sword.getName());
    System.out.println("Type: " + sword.getType());
    System.out.println("Power: " + sword.getPower());
  }
}