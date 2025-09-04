package oop.lsp;

// Ostrich can't fly, only move
public class Ostrich implements Moveable {

    @Override
    public void move() {
        // Ostrich runs to move
        System.out.println("Ostrich is running.");
    }
}
