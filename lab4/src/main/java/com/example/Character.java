package com.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Character {
  private String name;
  private int health;
  @Builder.Default
  private int mana = 0;
  private String role; // e.g., Warrior, Mage
}