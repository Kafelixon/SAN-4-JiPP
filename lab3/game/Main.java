package game;

import game.entity.Entity;
import game.entity.Player;
import game.entity.Wolf;
import game.worldobject.Crate;
import game.worldobject.WorldObject;

public class Main {
  public static void main(String[] args) {
    // Create a player entity
    Player player = new Player("John", 100, 10);

    // Create an enemy entity
    Entity wolf = new Wolf("Wolf", 50, 5);

    // Create a world object
    WorldObject crate = new Crate("Crate");

    // Make the player attack the wolf
    player.attack(wolf);

    // Make the wolf attack the player
    wolf.attack(player);

    // Make the player interact with the crate
    player.interact(crate);

    // Print out the current state of the entities
    System.out.println("Player health: " + player.getHealth());
    System.out.println("Wolf health: " + wolf.getHealth());
  }
}