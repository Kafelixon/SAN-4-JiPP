package game.entity;

public  class Bandit extends Entity {
  public Bandit(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public void update() {
    // bandit update logic
  }
}