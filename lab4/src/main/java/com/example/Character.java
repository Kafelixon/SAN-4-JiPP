package com.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Character {
  private String name;
  private int health;
  private int mana;
  private String role; // e.g., Warrior, Mage
}