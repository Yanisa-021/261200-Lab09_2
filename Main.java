package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create birds
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();

        // List of birds that can fly
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(sparrow);
        flyingBirds.add(eagle);

        // List of all birds that can move
        List<Moveable> allBirds = new ArrayList<>();
        allBirds.add(sparrow);
        allBirds.add(eagle);
        allBirds.add(penguin);
        allBirds.add(ostrich);

        System.out.println(" All birds moving ");
        for (Moveable bird : allBirds) {
            bird.move();  // All birds move
        }

        System.out.println("\n Flying birds flying");
        for (Flyable bird : flyingBirds) {
            bird.fly();  // Only flying birds fly
        }

        System.out.println("\n Using performMove method ");
        performMove(sparrow);  // Sparrow moves
        performMove(penguin);  // Penguin moves

        // We never call fly() on Penguin or Ostrich because they don't implement Flyable
        // This respects Liskov Substitution Principle (LSP) and avoids runtime errors
    }

    // This method accepts any Moveable object
    // Shows that Flyable (subtype) can be used where Moveable is expected
    public static void performMove(Moveable moveable) {
        moveable.move();
    }
}
