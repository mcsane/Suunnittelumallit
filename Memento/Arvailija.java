import java.util.Random;

public class Arvailija implements Runnable {
    private final Arvuuttaja arvuuttaja;

    public Arvailija(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        Memento memento = arvuuttaja.liityPeliin();
        int guess = -1; 

        while (!arvuuttaja.arvaa(memento, guess)) {
            guess = new Random().nextInt(10);
            System.out.println(Thread.currentThread().getName() + ": Arvaus " + guess);
        }

        System.out.println(Thread.currentThread().getName() + ": Oikea arvaus!");
    }
}