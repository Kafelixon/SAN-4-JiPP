package game.worldobject;

public  class Tree extends WorldObject {
  private static int HEALTH = 100;

  public Tree(String name) {
    super(name, HEALTH);
  }
}