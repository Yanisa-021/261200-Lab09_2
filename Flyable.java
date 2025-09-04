package oop.lsp;

// Interface for anything that can fly
// Flyable is also Moveable (fly is a kind of move)
public interface Flyable extends Moveable {
    // Fly action
    void fly();
}
