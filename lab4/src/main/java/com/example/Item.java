package com.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Item {
  private String name;
  private String type; // e.g., Weapon, Armor
  private int power;
}