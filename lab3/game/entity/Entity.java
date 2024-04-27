package game.entity;

import game.gameobject.GameObject;

public abstract class Entity extends GameObject implements Attackable {
  private int attackPower;

  public Entity(String name, int health, int attackPower) {
    super(name, health);
    this.attackPower = attackPower;
    System.out.println("Entity " + name + " created." + " Health: " + health + " Attack Power: " + attackPower);
  }

  public int getAttackPower() {
    return attackPower;
  }

  public void attack(Entity target) {
    System.out.println(getName() + " attacks " + target.getName() + " for " + attackPower + " damage.");
    target.takeDamage(attackPower);
  }

  public abstract void update();
}