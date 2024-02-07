public class Main {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("Laskurin arvo: " + counter.getCount());

        Counter anotherCounter = Counter.getInstance();

        anotherCounter.decrement();

        System.out.println("Laskurin arvo: " + counter.getCount());
    }
}