package oop.lsp;

// Penguin can't fly, so it only moves
public class Penguin implements Moveable {

    @Override
    public void move() {
        // Penguin waddles when it moves
        System.out.println("Penguin is waddling.");
    }
}
