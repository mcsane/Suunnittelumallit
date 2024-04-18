public class Main {
    public static void main(String[] args) {
        Kello originalKello = new Kello(10, 15);
        originalKello.getAika();

        Kello clonedKello = originalKello.clone();
        clonedKello.getAika();

        originalKello.setAika(11, 30);
        System.out.println("Original kello time after modification:");
        originalKello.getAika();

        System.out.println("Cloned kello time after original modification:");
        clonedKello.getAika();

        Kello shallowClonedKello = originalKello.matalaKlooni();
        System.out.println("Shallow cloned kello time:");
        shallowClonedKello.getAika();

        originalKello.setAika(12, 45);
        System.out.println("Original kello time after second modification:");
        originalKello.getAika();

        System.out.println("Shallow cloned kello time after original second modification:");
        shallowClonedKello.getAika();
    }
}