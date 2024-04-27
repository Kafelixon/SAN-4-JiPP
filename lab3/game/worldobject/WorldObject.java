package game.worldobject;

import game.gameobject.GameObject;

public abstract  class WorldObject extends GameObject {

  public WorldObject(String name, int health) {
    super(name, health);
  }
}