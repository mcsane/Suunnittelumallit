import java.util.Random;

public class Arvuuttaja {
    private final Random random = new Random();
    private final int secretNumber;

    public Arvuuttaja() {
        secretNumber = random.nextInt(10);
    }


    public Memento liityPeliin() {
        return new Memento(secretNumber);
    }


    public boolean arvaa(Memento memento, int guess) {
        return guess == memento.getNumber();
    }
}