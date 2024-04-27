package game.entity;

import game.gameobject.GameObject;

public  class Player extends Entity {
  private int score;

  public Player(String name, int health, int attackPower) {
    super(name, health, attackPower);
    this.score = 0;
  }

  public int getScore() {
    return score;
  }

  public void increaseScore(int points) {
    score += points;
  }

  public void interact(GameObject object) {
    System.out.println("Player " + getName() + " interacts with " + object.getName());
  }

  @Override
  public void update() {
    // player update logic
  }
}