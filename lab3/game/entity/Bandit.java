package game.entity;

public  class Bandit extends Entity {
  public Bandit(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public void attack(Entity target) {
    // bandit attack logic
    target.takeDamage(getAttackPower());
  }

  @Override
  public void update() {
    // bandit update logic
  }
}