package oop.lsp;

// Eagle can fly, so implements Flyable
public class Eagle implements Flyable {

    @Override
    public void move() {
        // Eagle walks when on the ground
        System.out.println("Eagle is walking.");
    }

    @Override
    public void fly() {
        // Eagle soars high in the sky
        System.out.println("Eagle is soaring high.");
    }
}
