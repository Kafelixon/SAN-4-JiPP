package game.worldobject;

public  class Crate extends WorldObject {
  private static int HEALTH = 10;

  public Crate(String name) {
    super(name, HEALTH);
  }
}