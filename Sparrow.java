package oop.lsp;

// Sparrow can fly, so it implements Flyable
public class Sparrow implements Flyable {

    @Override
    public void move() {
        // Sparrow hops to move
        System.out.println("Sparrow is hopping.");
    }

    @Override
    public void fly() {
        // Sparrow flies
        System.out.println("Sparrow is flying.");
    }
}
